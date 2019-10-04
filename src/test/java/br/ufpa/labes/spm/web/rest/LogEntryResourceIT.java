package br.ufpa.labes.spm.web.rest;

import br.ufpa.labes.spm.SpmApp;
import br.ufpa.labes.spm.domain.LogEntry;
import br.ufpa.labes.spm.repository.LogEntryRepository;
import br.ufpa.labes.spm.web.rest.errors.ExceptionTranslator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static br.ufpa.labes.spm.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link LogEntryResource} REST controller.
 */
@EmbeddedKafka
@SpringBootTest(classes = SpmApp.class)
public class LogEntryResourceIT {

    private static final LocalDate DEFAULT_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE = LocalDate.now(ZoneId.systemDefault());
    private static final LocalDate SMALLER_DATE = LocalDate.ofEpochDay(-1L);

    private static final String DEFAULT_OPERATION = "AAAAAAAAAA";
    private static final String UPDATED_OPERATION = "BBBBBBBBBB";

    private static final String DEFAULT_CLASS_NAME = "AAAAAAAAAA";
    private static final String UPDATED_CLASS_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_UID = "AAAAAAAAAA";
    private static final String UPDATED_UID = "BBBBBBBBBB";

    @Autowired
    private LogEntryRepository logEntryRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restLogEntryMockMvc;

    private LogEntry logEntry;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final LogEntryResource logEntryResource = new LogEntryResource(logEntryRepository);
        this.restLogEntryMockMvc = MockMvcBuilders.standaloneSetup(logEntryResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static LogEntry createEntity(EntityManager em) {
        LogEntry logEntry = new LogEntry()
            .date(DEFAULT_DATE)
            .operation(DEFAULT_OPERATION)
            .className(DEFAULT_CLASS_NAME)
            .uid(DEFAULT_UID);
        return logEntry;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static LogEntry createUpdatedEntity(EntityManager em) {
        LogEntry logEntry = new LogEntry()
            .date(UPDATED_DATE)
            .operation(UPDATED_OPERATION)
            .className(UPDATED_CLASS_NAME)
            .uid(UPDATED_UID);
        return logEntry;
    }

    @BeforeEach
    public void initTest() {
        logEntry = createEntity(em);
    }

    @Test
    @Transactional
    public void createLogEntry() throws Exception {
        int databaseSizeBeforeCreate = logEntryRepository.findAll().size();

        // Create the LogEntry
        restLogEntryMockMvc.perform(post("/api/log-entries")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(logEntry)))
            .andExpect(status().isCreated());

        // Validate the LogEntry in the database
        List<LogEntry> logEntryList = logEntryRepository.findAll();
        assertThat(logEntryList).hasSize(databaseSizeBeforeCreate + 1);
        LogEntry testLogEntry = logEntryList.get(logEntryList.size() - 1);
        assertThat(testLogEntry.getDate()).isEqualTo(DEFAULT_DATE);
        assertThat(testLogEntry.getOperation()).isEqualTo(DEFAULT_OPERATION);
        assertThat(testLogEntry.getClassName()).isEqualTo(DEFAULT_CLASS_NAME);
        assertThat(testLogEntry.getUid()).isEqualTo(DEFAULT_UID);
    }

    @Test
    @Transactional
    public void createLogEntryWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = logEntryRepository.findAll().size();

        // Create the LogEntry with an existing ID
        logEntry.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restLogEntryMockMvc.perform(post("/api/log-entries")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(logEntry)))
            .andExpect(status().isBadRequest());

        // Validate the LogEntry in the database
        List<LogEntry> logEntryList = logEntryRepository.findAll();
        assertThat(logEntryList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllLogEntries() throws Exception {
        // Initialize the database
        logEntryRepository.saveAndFlush(logEntry);

        // Get all the logEntryList
        restLogEntryMockMvc.perform(get("/api/log-entries?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(logEntry.getId().intValue())))
            .andExpect(jsonPath("$.[*].date").value(hasItem(DEFAULT_DATE.toString())))
            .andExpect(jsonPath("$.[*].operation").value(hasItem(DEFAULT_OPERATION.toString())))
            .andExpect(jsonPath("$.[*].className").value(hasItem(DEFAULT_CLASS_NAME.toString())))
            .andExpect(jsonPath("$.[*].uid").value(hasItem(DEFAULT_UID.toString())));
    }
    
    @Test
    @Transactional
    public void getLogEntry() throws Exception {
        // Initialize the database
        logEntryRepository.saveAndFlush(logEntry);

        // Get the logEntry
        restLogEntryMockMvc.perform(get("/api/log-entries/{id}", logEntry.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(logEntry.getId().intValue()))
            .andExpect(jsonPath("$.date").value(DEFAULT_DATE.toString()))
            .andExpect(jsonPath("$.operation").value(DEFAULT_OPERATION.toString()))
            .andExpect(jsonPath("$.className").value(DEFAULT_CLASS_NAME.toString()))
            .andExpect(jsonPath("$.uid").value(DEFAULT_UID.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingLogEntry() throws Exception {
        // Get the logEntry
        restLogEntryMockMvc.perform(get("/api/log-entries/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateLogEntry() throws Exception {
        // Initialize the database
        logEntryRepository.saveAndFlush(logEntry);

        int databaseSizeBeforeUpdate = logEntryRepository.findAll().size();

        // Update the logEntry
        LogEntry updatedLogEntry = logEntryRepository.findById(logEntry.getId()).get();
        // Disconnect from session so that the updates on updatedLogEntry are not directly saved in db
        em.detach(updatedLogEntry);
        updatedLogEntry
            .date(UPDATED_DATE)
            .operation(UPDATED_OPERATION)
            .className(UPDATED_CLASS_NAME)
            .uid(UPDATED_UID);

        restLogEntryMockMvc.perform(put("/api/log-entries")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedLogEntry)))
            .andExpect(status().isOk());

        // Validate the LogEntry in the database
        List<LogEntry> logEntryList = logEntryRepository.findAll();
        assertThat(logEntryList).hasSize(databaseSizeBeforeUpdate);
        LogEntry testLogEntry = logEntryList.get(logEntryList.size() - 1);
        assertThat(testLogEntry.getDate()).isEqualTo(UPDATED_DATE);
        assertThat(testLogEntry.getOperation()).isEqualTo(UPDATED_OPERATION);
        assertThat(testLogEntry.getClassName()).isEqualTo(UPDATED_CLASS_NAME);
        assertThat(testLogEntry.getUid()).isEqualTo(UPDATED_UID);
    }

    @Test
    @Transactional
    public void updateNonExistingLogEntry() throws Exception {
        int databaseSizeBeforeUpdate = logEntryRepository.findAll().size();

        // Create the LogEntry

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restLogEntryMockMvc.perform(put("/api/log-entries")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(logEntry)))
            .andExpect(status().isBadRequest());

        // Validate the LogEntry in the database
        List<LogEntry> logEntryList = logEntryRepository.findAll();
        assertThat(logEntryList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteLogEntry() throws Exception {
        // Initialize the database
        logEntryRepository.saveAndFlush(logEntry);

        int databaseSizeBeforeDelete = logEntryRepository.findAll().size();

        // Delete the logEntry
        restLogEntryMockMvc.perform(delete("/api/log-entries/{id}", logEntry.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<LogEntry> logEntryList = logEntryRepository.findAll();
        assertThat(logEntryList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(LogEntry.class);
        LogEntry logEntry1 = new LogEntry();
        logEntry1.setId(1L);
        LogEntry logEntry2 = new LogEntry();
        logEntry2.setId(logEntry1.getId());
        assertThat(logEntry1).isEqualTo(logEntry2);
        logEntry2.setId(2L);
        assertThat(logEntry1).isNotEqualTo(logEntry2);
        logEntry1.setId(null);
        assertThat(logEntry1).isNotEqualTo(logEntry2);
    }
}
