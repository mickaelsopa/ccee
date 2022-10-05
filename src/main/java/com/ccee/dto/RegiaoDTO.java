package com.ccee.dto;

import lombok.Data;

import java.util.List;

@Data
public class RegiaoDTO {

    private String sigla;
    private List<CompraDTO> comprasDTO;
    private List<GeracaoDTO> geracoesDTO;
    private List<PrecoMedioDTO> precosMedioDTO;
}
