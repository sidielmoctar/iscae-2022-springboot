package com.exo.correction.data.repository;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.exercice.dtos.PersonneDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RepositoryRestResource(exported = false)
public interface PersonneRepository
        extends JpaRepository<PersonneEntity, Integer> {

    @Query("select new com.exo.correction.exercice.dtos.PersonneDto(" +
            "p.id, p.prenom, p.nom, p.tel, " +
            "p.email, " +
            "p.idGenre) " +
            "from PersonneEntity p ")
    List<PersonneDto> findAllCustom();

    @Query(value = " select p.id, p.prenom, p.nom, p.tel, " +
            "p.email, p.id_genre as idGenre from personne p ",
            nativeQuery = true)
    List<Map<String, Object>> findAllNative();
}
