package com.joinautou.joinautou.repositories;

import com.joinautou.joinautou.entities.Reacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ReacaoRepository extends JpaRepository<Reacao, Long> {



    @Modifying(clearAutomatically = true)
    @Query( value = "INSERT INTO reacao (data_de_envio, colaborador_destinatario_id, colaborador_remetente_id, tipo_reacao_id) " +
            "VALUES (:localDate, :colaborador_destinatario_id, :colaborador_remetente_id, :tipo_reacao_id);", nativeQuery = true)
    void addNewReacao(@Param("localDate") LocalDate localDate, @Param("colaborador_destinatario_id") Long colaborador_destinatario_id,
                      @Param("colaborador_remetente_id") Long colaborador_remetente_id,  @Param("tipo_reacao_id") Long tipo_reacao_id);
}