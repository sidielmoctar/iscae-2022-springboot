package com.exo.correction.exercice;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.data.repository.PersonneRepository;
import com.exo.correction.exercice.dtos.PersonneDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abderrahmane
 */

@RestController
@RequestMapping("exo13")
public class Exo13Controller {

    private final PersonneRepository personneRepository;

    @Autowired
    public Exo13Controller(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping
    public List<PersonneDto> getAll() {
        List<PersonneDto> personneDtos = personneRepository
                .findAll()
                .stream()
                .map(p -> {
                    PersonneDto personneDto = new PersonneDto();
                    personneDto.setId(p.getId());
                    personneDto.setNom(p.getNom());
                    personneDto.setPrenom(p.getPrenom());
                    personneDto.setTel(p.getTel());
                    personneDto.setIdGenre(p.getIdGenre());

                    return personneDto;
                }).collect(Collectors.toList());
        return personneDtos;
    }

    @GetMapping("custom")
    public List<PersonneDto> findAllCustom() {
        return personneRepository.findAllCustom();
    }

    @GetMapping("native")
    public List<PersonneDto> findAllNative() {
        List<PersonneDto> personneDtos = personneRepository
                .findAllNative()
                .stream()
                .map(p -> new ObjectMapper().convertValue(p, PersonneDto.class))
                .collect(Collectors.toList());
        return personneDtos;
    }
}
