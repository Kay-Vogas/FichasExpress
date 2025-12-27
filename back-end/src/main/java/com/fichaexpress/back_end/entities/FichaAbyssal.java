package com.fichaexpress.back_end.entities;

<<<<<<< HEAD
public class FichaAbyssal {

    private String personagemName;
    private Usuario usuario;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FichaAbyssal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

>>>>>>> 0a36db6315c0648c8f8cca8d6bc9f5c9a0cbac90

}
