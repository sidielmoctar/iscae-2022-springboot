package com.exo.correction.exercice;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.data.repository.PersonneRepository;
import com.exo.correction.exercice.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<PersonneEntity> getAll() {
        return personneRepository.findAll();
    }
}
