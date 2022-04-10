package com.joinautou.joinautou.controllers;

import com.joinautou.joinautou.entities.Colaborador;
import com.joinautou.joinautou.entities.Reacao;
import com.joinautou.joinautou.services.ReacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReacaoController {
    @Autowired
    private ReacaoService reacaoService;

    @GetMapping("/reacao")
    public @ResponseBody
    List<Reacao> getAllReacoes() {
        return this.reacaoService.getAllReacoes();
    }

    // *************** POST ******************

    @GetMapping("/reacao/{idRemetente}/{idReacao}/{idDestinatario}")
    public ResponseEntity addNewReacao(@PathVariable(value= "idRemetente") Long colaborador_remetente_id, @PathVariable(value= "idReacao") Long idReacao, @PathVariable(value= "idDestinatario") Long colaborador_destinatario_id ){
        this.reacaoService.addNewReacao(colaborador_remetente_id, idReacao, colaborador_destinatario_id);
        return new ResponseEntity(HttpStatus.CREATED);
    }


}
