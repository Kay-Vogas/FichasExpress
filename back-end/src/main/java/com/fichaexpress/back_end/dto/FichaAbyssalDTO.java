package com.fichaexpress.back_end.dto;


import com.fichaexpress.back_end.entities.FichaAbyssal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class FichaAbyssalDTO {

    private String imagemPersonagem;
    private String personagem;
    private String origem;
    private Integer nex;
    private Integer ne;

    public FichaAbyssalDTO(){}

    public FichaAbyssalDTO(FichaAbyssal fichaAbyssal) {
        BeanUtils.copyProperties(fichaAbyssal, this);
    }

}
