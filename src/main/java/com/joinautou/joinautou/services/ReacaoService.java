package com.joinautou.joinautou.services;

import com.joinautou.joinautou.entities.Colaborador;
import com.joinautou.joinautou.entities.Reacao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReacaoService {
    List<Reacao> getAllReacoes();

    void addNewReacao(Long colaborador_remetente_id, Long idReacao, Long colaborador_destinatario_id);
}
