package com.joinautou.joinautou.services.impl;

import com.joinautou.joinautou.entities.TipoReacao;
import com.joinautou.joinautou.repositories.TipoReacaoRepository;
import com.joinautou.joinautou.services.TipoReacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoReacaoServiceImpl implements TipoReacaoService {

    @Autowired
    private TipoReacaoRepository tipoReacaoRepository;

    @Override
    public List<TipoReacao> getAllTiposReacao() {
        return tipoReacaoRepository.findAll();
    }

    @Override
    public Optional<TipoReacao> findTipoReacaoById(Long id) {
        return tipoReacaoRepository.findById(id);
    }

    @Override
    public List<TipoReacao> findTipoReacaoByReacao(String reacao) {
        return tipoReacaoRepository.findByReacao(reacao);
    }
}
