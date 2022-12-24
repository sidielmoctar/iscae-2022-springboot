package com.exo.correction.exercice.dtos;

import lombok.Data;

/**
 * @author Abderrahmane
 */
@Data
public class PersonneDto {
   private int id;
   private String prenom;
   private String nom;
   private String tel;
   private String email;
   private int idGenre;
}
