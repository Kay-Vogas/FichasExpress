package com.fichaexpress.back_end.entities;

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
public class FichaAbyssal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    private String personagem;

    private Integer nex;

    private Integer atributoAgilidade;
    private Integer atributoForca;
    private Integer atributoPresenca;
    private Integer atributoInteligencia;
    private Integer atributoVigor;

    @Enumerated(EnumType.STRING)
    private ClassesOrdemParanormal classes;

    private boolean Subclasse;

    private Integer pv;
    private Integer sanidade;
    private Integer pe;

    //Dados de REDUÇÃO DE SANIDADE
    private Integer dadoSanidade;

    public void dadoDeSanidade(Integer dadoSanidade) {

        Random ValorDadoSanidade = new Random();
        System.out.println(ValorDadoSanidade.nextInt(4));

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
}
