package com.joinautou.joinautou.repositories;

import com.joinautou.joinautou.entities.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
    List<Colaborador> findByNome(String nome);

    Optional<Colaborador> findByMatricula(Integer matricula);
}