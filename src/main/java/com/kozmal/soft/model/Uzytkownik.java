/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kozmal.soft.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author andrew
 */
@Entity
@Table(name = "DaneUzytkownikow")
public class Uzytkownik extends Konto implements Serializable {

      private String imie;
      private String nazwisko;
      private ArrayList<String> telefony;
      private Firma daneFirmy;
      private Adress adres;

      public Uzytkownik() {
      }

}
