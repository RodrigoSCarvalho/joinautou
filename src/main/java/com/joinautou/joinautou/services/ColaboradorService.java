package com.joinautou.joinautou.services;

import com.joinautou.joinautou.entities.Colaborador;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ColaboradorService {
    List<Colaborador> getAllColaboradores();

    Optional<Colaborador> findColaboradorById(Long id);

    List<Colaborador> findColaboradorByNome(String nome);

    Optional<Colaborador> findColaboradorByMatricula(Integer matricula);
}
