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

    public FichaAbyssal atualizarFichaAbyssal(FichaAbyssal fichaAbyssal){
        //

        FichaAbyssal fichaAbyssalAtualizado = new FichaAbyssal();
        return fichaAbyssalRepository.save(fichaAbyssal);
    }
}
