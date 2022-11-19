package com.exo.correction.exercice;

import com.exo.correction.exercice.dtos.LoginUser;
import com.exo.correction.exercice.dtos.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo9Controller {

   @PostMapping("exo9")
   public String hello(@RequestBody UserDto userObj) {

       return "Ok";
      }

}
