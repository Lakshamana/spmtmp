package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.people.PersonRepositoryQuery;


import br.ufpa.labes.spm.domain.Person;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Person entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PersonRepository extends PersonRepositoryQuery, JpaRepository<Person, Long> {

}
