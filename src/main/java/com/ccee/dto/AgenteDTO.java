package com.ccee.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AgenteDTO {

    private Long codigo;
    private String data;
    private List<RegiaoDTO> regioesDTO;
}
