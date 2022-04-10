package com.joinautou.joinautou.services.impl;

import com.joinautou.joinautou.entities.Colaborador;
import com.joinautou.joinautou.repositories.ColaboradorRepository;
import com.joinautou.joinautou.services.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @Override
    public List<Colaborador> getAllColaboradores() {
        return colaboradorRepository.findAll();
    }

    @Override
    public Optional<Colaborador> findColaboradorById(Long id) {
        return colaboradorRepository.findById(id);
    }

    @Override
    public List<Colaborador> findColaboradorByNome(String nome) {
        return colaboradorRepository.findByNome(nome);
    }

    @Override
    public Optional<Colaborador> findColaboradorByMatricula(Integer matricula) {
        return colaboradorRepository.findByMatricula(matricula);
    }
}
