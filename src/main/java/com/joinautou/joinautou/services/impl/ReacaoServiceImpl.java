package com.joinautou.joinautou.services.impl;

import com.joinautou.joinautou.entities.Colaborador;
import com.joinautou.joinautou.entities.Reacao;
import com.joinautou.joinautou.repositories.ReacaoRepository;
import com.joinautou.joinautou.services.ReacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReacaoServiceImpl implements ReacaoService {

    @Autowired
    private ReacaoRepository reacaoRepository;


    @Override
    public List<Reacao> getAllReacoes() {
        return reacaoRepository.findAll();
    }

    @Transactional
    @Override
    public void addNewReacao(Long colaborador_remetente_id, Long idReacao, Long colaborador_destinatario_id) {
        LocalDate localDate = LocalDate.now();
        reacaoRepository.addNewReacao(localDate,colaborador_destinatario_id, colaborador_remetente_id, idReacao);
    }
}
