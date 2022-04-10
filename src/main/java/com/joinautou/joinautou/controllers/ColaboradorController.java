package com.joinautou.joinautou.controllers;

import com.joinautou.joinautou.entities.Colaborador;
import com.joinautou.joinautou.services.ColaboradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;
    @GetMapping("/colaborador")
    public @ResponseBody
    List<Colaborador> getAllColaboradores() {
        // This returns a JSON or XML with the users
        return this.colaboradorService.getAllColaboradores();
    }

    @GetMapping("/colaborador/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Colaborador> findColaboradorById(@PathVariable Long id){
        return this.colaboradorService.findColaboradorById(id);

    }

    @GetMapping("/colaborador/matricula/{matricula}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Colaborador> findColaboradorByMatricula(@PathVariable Integer matricula){
        return this.colaboradorService.findColaboradorByMatricula(matricula);

    }

    @GetMapping("/colaborador/nome/{nome}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Colaborador> findColaboradorByNome(@PathVariable String nome){
        return this.colaboradorService.findColaboradorByNome(nome);

    }
}
