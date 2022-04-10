package com.joinautou.joinautou.controllers;

import com.joinautou.joinautou.entities.TipoReacao;
import com.joinautou.joinautou.services.TipoReacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class TipoReacaoController {

    @Autowired
    private TipoReacaoService tipoReacaoService;

    @GetMapping("/tiporeacao")
    public @ResponseBody
    List<TipoReacao> getAllTiposReacao() {
        return this.tipoReacaoService.getAllTiposReacao();
    }

    @GetMapping("/tiporeacao/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<TipoReacao> findTipoReacaoById(@PathVariable Long id){
        return this.tipoReacaoService.findTipoReacaoById(id);

    }

    @GetMapping("/tiporeacao/reacao/{reacao}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<TipoReacao> findColaboradorByNome(@PathVariable String reacao){
        return this.tipoReacaoService.findTipoReacaoByReacao(reacao);

    }
}
