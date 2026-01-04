package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.FichaAbyssal;
import com.fichaexpress.back_end.repositories.FichaAbyssalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FichaAbyssalService {

    @Autowired
    private FichaAbyssalRepository fichaAbyssalRepository;

    public FichaAbyssal createFichaAbyssal(FichaAbyssal fichaAbyssal){
        return fichaAbyssalRepository.save(fichaAbyssal);
    }

    public FichaAbyssal atualizarFichaAbyssal(Long id,FichaAbyssal fichaAbyssalAtualizado){

        return fichaAbyssalRepository.findById(id).map(fichaAbyssal->{
            fichaAbyssal.setImagemPersonagem(fichaAbyssalAtualizado.getImagemPersonagem());

            fichaAbyssal.setPersonagem(fichaAbyssalAtualizado.getPersonagem());

            fichaAbyssal.setNex(fichaAbyssalAtualizado.getNex());
            fichaAbyssal.setNe(fichaAbyssalAtualizado.getNe());

            fichaAbyssal.setAtributoAgilidade(fichaAbyssalAtualizado.getAtributoAgilidade());
            fichaAbyssal.setAtributoForca(fichaAbyssalAtualizado.getAtributoForca());
            fichaAbyssal.setAtributoInteligencia(fichaAbyssalAtualizado.getAtributoInteligencia());
            fichaAbyssal.setAtributoVigor(fichaAbyssalAtualizado.getAtributoVigor());
            fichaAbyssal.setAtributoPresenca(fichaAbyssalAtualizado.getAtributoPresenca());

            fichaAbyssal.calcularPV(fichaAbyssal.getAtributoVigor());
            fichaAbyssal.calcularPE(fichaAbyssal.getAtributoPresenca());
            fichaAbyssal.calcularSan();

            return fichaAbyssalRepository.save(fichaAbyssal);}).orElse(null);

    }
}
