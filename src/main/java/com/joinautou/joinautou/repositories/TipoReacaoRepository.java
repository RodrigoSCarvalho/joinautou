
package com.joinautou.joinautou.repositories;

import com.joinautou.joinautou.entities.TipoReacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoReacaoRepository extends JpaRepository<TipoReacao, Long> {
    List<TipoReacao> findByReacao(String reacao);
}