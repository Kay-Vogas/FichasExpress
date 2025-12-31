package com.fichaexpress.back_end.entities;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
=======
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
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d
public class FichaAbyssal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    private String personagem;

    private Integer nex;
=======
    //private User user;

    private String personagem;

>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d

    private Integer atributoAgilidade;
    private Integer atributoForca;
    private Integer atributoPresenca;
    private Integer atributoInteligencia;
    private Integer atributoVigor;

<<<<<<< HEAD
    @Enumerated(EnumType.STRING)
    private ClassesOrdemParanormal classes;

    private boolean Subclasse;

    private Integer pv;
    private Integer sanidade;
    private Integer pe;

    //Dados de REDUÇÃO DE SANIDADE
    private Integer dadoSanidade;

    public void dadoDeSanidade(){
        //Random dadoSanidade = new Random();
        //System.out.println(dadoSanidade.nextInt(4));
    }


    public void calcularPV(Integer atributoVigor){
        if(this.classes == null) return;

        if(classes.equals("COMBATENTE")){
            this.pv = (20+atributoVigor) + (nex * (4 + atributoVigor));
        } else if(classes.equals("ESPECIALISTA")){
            this.pv = (16+atributoVigor) + (nex * (3 + atributoVigor));
        } else if (classes.equals("OCULTISTA")) {
            this.pv = (12+atributoVigor) + (nex * (2 + atributoVigor));
        }
    }

    public void calcularPE(Integer atributoPresenca){
        if(this.classes == null) return;

        if(classes.equals("COMBATENTE")){
            this.pe = (2+atributoPresenca) + (nex * (2 + atributoPresenca));
        }else if(classes.equals("ESPECIALISTA")){
            this.pe = (3+atributoPresenca) + (nex * (3 + atributoPresenca));
        } else if (classes.equals("OCULTISTA")) {
            this.pe = (4+atributoPresenca) + (nex * (4 + atributoPresenca));
        }
    }

    public void calcularSan(){
        if(this.classes == null) return;

        if(classes.equals("COMBATENTE")){
            this.sanidade = (12 + (nex * 3)) ;
        }else if(classes.equals("ESPECIALISTA")){
            this.sanidade = (16 + (nex * 4)) ;
        } else if (classes.equals("OCULTISTA")) {
            this.sanidade = (20 + (nex * 5)) ;
        }
    }
=======
    private String classeCombatente;
    private String classeEspecialista;
    private String classeOcultista;

>>>>>>> 0a36db6315c0648c8f8cca8d6bc9f5c9a0cbac90
>>>>>>> 1c428e8bad15076a0c45ffc2ca9bdd5e33e5f24d

}
