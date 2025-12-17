package com.fichaexpress.back_end.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class FichaAbyssal {

    private Long id;

    //private User user;

    private String personagem;


    private Integer atributoAgilidade;
    private Integer atributoForca;
    private Integer atributoPresenca;
    private Integer atributoInteligencia;
    private Integer atributoVigor;

    private String classeCombatente;
    private String classeEspecialista;
    private String classeOcultista;


}
