/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kozmal.soft.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author andrew
 */
@Entity
@Table(name = "DaneUrzytkownika")
public class Konto extends AbstractEntity implements Serializable {

      @Id
      private Long id;

      @NotNull(message = "{constraint.notnull}")
      @Size(min = 3, max = 32, message = "{constraint.string.length.notinrange}")
      @Pattern(regexp = "^[a-z0-9_-]$", message = "{constraint.string.incorrectchar}")
      @Column(name = "login", length = 32, nullable = false, unique = true, updatable = false)
      private String login;

      @NotNull(message = "{constraint.notnull}")
      @Size(min = 6, message = "{constraint.string.length.tooshort}")
      @Column(name = "haslo", length = 256, nullable = false)
      private String haslo;

      @Column(name = "potwierdzone", nullable = false)
      private boolean potwierdzone;

      @Column(name = "aktywne", nullable = false)
      private boolean aktywne;

      @NotNull(message = "{constraint.notnull}")
      @Size(min = 6, max = 64, message = "{constraint.string.length.notinrange}")
      @Pattern(regexp = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$", message = "{constraint.string.incorrectemail}")
      @Column(name = "email", length = 64, unique = true, nullable = false)
      private String email;

      @Override
      protected Long getId() {
            return id;
      }

      @Override
      protected String getBusinessKey() {
            return login;
      }

      public String getLogin() {
            return login;
      }

      public void setLogin(String login) {
            this.login = login;
      }

      public String getHaslo() {
            return haslo;
      }

      public void setHaslo(String haslo) {
            this.haslo = haslo;
      }

      public boolean isPotwierdzone() {
            return potwierdzone;
      }

      public void setPotwierdzone(boolean potwierdzone) {
            this.potwierdzone = potwierdzone;
      }

      public boolean isAktywne() {
            return aktywne;
      }

      public void setAktywne(boolean aktywne) {
            this.aktywne = aktywne;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }
      
      
      

}
