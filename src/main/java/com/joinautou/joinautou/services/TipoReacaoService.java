package com.joinautou.joinautou.services;

import com.joinautou.joinautou.entities.TipoReacao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoReacaoService {
    List<TipoReacao> getAllTiposReacao();

    Optional<TipoReacao> findTipoReacaoById(Long id);

    List<TipoReacao> findTipoReacaoByReacao(String reacao);
}
