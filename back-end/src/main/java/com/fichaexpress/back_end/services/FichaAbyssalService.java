package com.fichaexpress.back_end.services;

import com.fichaexpress.back_end.entities.FichaAbyssal;
import com.fichaexpress.back_end.repositories.FichaAbyssalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FichaAbyssalService {

    @Autowired
    private FichaAbyssalRepository fichaAbyssalRepository;


    @Transactional
    public FichaAbyssal buscarFichaAbyssalPorId(Long id){
        return fichaAbyssalRepository.findById(id).orElse(null);
    }

    @Transactional
    public FichaAbyssal createFichaAbyssal(FichaAbyssal fichaAbyssal){
        fichaAbyssal.atualizarStatus();
        return fichaAbyssalRepository.save(fichaAbyssal);
    }

    @Transactional
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

            if (fichaAbyssalAtualizado.getPericias() != null) {
                fichaAbyssal.setPericias(fichaAbyssalAtualizado.getPericias());
            }


            fichaAbyssal.atualizarStatus();

            return fichaAbyssalRepository.save(fichaAbyssal);
        }).orElseThrow(() -> new RuntimeException("Ficha não encontrada"));

    }
}
