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

   public PersonneDto() {
   }

   public PersonneDto(int id, String prenom,
                      String nom, String tel,
                      String email, int idGenre) {
      this.id = id;
      this.prenom = prenom;
      this.nom = nom;
      this.tel = tel;
      this.email = email;
      this.idGenre = idGenre;
   }
}
