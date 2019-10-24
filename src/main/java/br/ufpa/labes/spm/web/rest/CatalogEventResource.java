package br.ufpa.labes.spm.web.rest;

import br.ufpa.labes.spm.domain.CatalogEvent;
import br.ufpa.labes.spm.repository.interfaces.GenericRepository;
import br.ufpa.labes.spm.repository.CatalogEventRepository;
import br.ufpa.labes.spm.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link br.ufpa.labes.spm.domain.CatalogEvent}.
 */
@RestController
@RequestMapping("/api")
public class CatalogEventResource {

    private final Logger log = LoggerFactory.getLogger(CatalogEventResource.class);

    private static final String ENTITY_NAME = "catalogEvent";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final GenericRepository<CatalogEvent, Long> catalogEventRepository;

    public CatalogEventResource(GenericRepository<CatalogEvent, Long> catalogEventRepository) {
        this.catalogEventRepository = catalogEventRepository;
    }

    /**
     * {@code POST  /catalog-events} : Create a new catalogEvent.
     *
     * @param catalogEvent the catalogEvent to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new catalogEvent, or with status {@code 400 (Bad Request)} if the catalogEvent has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/catalog-events")
    public ResponseEntity<CatalogEvent> createCatalogEvent(@RequestBody CatalogEvent catalogEvent) throws URISyntaxException {
        log.debug("REST request to save CatalogEvent : {}", catalogEvent);
        if (catalogEvent.getId() != null) {
            throw new BadRequestAlertException("A new catalogEvent cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CatalogEvent result = catalogEventRepository.save(catalogEvent);
        return ResponseEntity.created(new URI("/api/catalog-events/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /catalog-events} : Updates an existing catalogEvent.
     *
     * @param catalogEvent the catalogEvent to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated catalogEvent,
     * or with status {@code 400 (Bad Request)} if the catalogEvent is not valid,
     * or with status {@code 500 (Internal Server Error)} if the catalogEvent couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/catalog-events")
    public ResponseEntity<CatalogEvent> updateCatalogEvent(@RequestBody CatalogEvent catalogEvent) throws URISyntaxException {
        log.debug("REST request to update CatalogEvent : {}", catalogEvent);
        if (catalogEvent.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        CatalogEvent result = catalogEventRepository.save(catalogEvent);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, catalogEvent.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /catalog-events} : get all the catalogEvents.
     *

     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of catalogEvents in body.
     */
    @GetMapping("/catalog-events")
    public List<CatalogEvent> getAllCatalogEvents() {
        log.debug("REST request to get all CatalogEvents");
        return catalogEventRepository.findAll();
    }

    /**
     * {@code GET  /catalog-events/:id} : get the "id" catalogEvent.
     *
     * @param id the id of the catalogEvent to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the catalogEvent, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/catalog-events/{id}")
    public ResponseEntity<CatalogEvent> getCatalogEvent(@PathVariable Long id) {
        log.debug("REST request to get CatalogEvent : {}", id);
        Optional<CatalogEvent> catalogEvent = catalogEventRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(catalogEvent);
    }

    /**
     * {@code DELETE  /catalog-events/:id} : delete the "id" catalogEvent.
     *
     * @param id the id of the catalogEvent to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/catalog-events/{id}")
    public ResponseEntity<Void> deleteCatalogEvent(@PathVariable Long id) {
        log.debug("REST request to delete CatalogEvent : {}", id);
        catalogEventRepository.deleteById(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}
