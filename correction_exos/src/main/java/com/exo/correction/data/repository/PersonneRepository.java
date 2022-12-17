package com.exo.correction.data.repository;

import com.exo.correction.data.entity.PersonneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface PersonneRepository
        extends JpaRepository<PersonneEntity, Integer> {

}
