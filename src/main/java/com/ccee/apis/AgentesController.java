package com.ccee.apis;

import com.ccee.dto.AgenteDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
@RequestMapping("/agentes")
public class AgentesController {

    @PostMapping(value = "/agente", consumes = "application/json")
    ResponseEntity<?> agentesPost(@RequestBody AgenteDTO agenteDTO) {
        try {
            System.out.println("Codigo agente: " + agenteDTO.getCodigo());
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            log.error("Error ", e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
