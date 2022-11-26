package com.exo.correction.exercice;

import com.exo.correction.exercice.data.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Abderrahmane
 */

@RestController
@RequestMapping("exo10")
public class Exo10Controller {

    UserRepository userRepository;
    public Exo10Controller() {
        userRepository = new UserRepository();
    }

//    Tous les users
    @GetMapping
    public List<UserDto> getAll() {
        return userRepository.getUsers();
    }

//    User by id
    @GetMapping("/{id}")
    public UserDto getById(@PathVariable("id") int id) {
        return userRepository.getUserById(id);
    }

//    ajout user

    @PostMapping
    List<UserDto> add( @RequestBody UserDto  userDto ) {
         return userRepository.add(userDto);
    }

//    update user

    @PutMapping("/{id}")
    List<UserDto> update( @RequestBody UserDto  userDto,  @PathVariable("id") int id) {
        return userRepository.update(userDto, id);
    }

//    delete user






}
