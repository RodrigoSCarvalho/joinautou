package com.joinautou.joinautou.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colaborador_remetente_id", referencedColumnName = "id")
    private Colaborador colaborador_remetente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colaborador_destinatario_id", referencedColumnName = "id")
    private Colaborador colaborador_destinatario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_reacao_id", referencedColumnName = "id")
    private TipoReacao reacao;

    private Date data_de_envio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Colaborador getColaborador_remetente() {
        return colaborador_remetente;
    }

    public void setColaborador_remetente(Colaborador colaborador_remetente) {
        this.colaborador_remetente = colaborador_remetente;
    }

    public Colaborador getColaborador_destinatario() {
        return colaborador_destinatario;
    }

    public void setColaborador_destinatario(Colaborador colaborador_destinatario) {
        this.colaborador_destinatario = colaborador_destinatario;
    }

    public TipoReacao getReacao() {
        return reacao;
    }

    public void setReacao(TipoReacao reacao) {
        this.reacao = reacao;
    }

    public Date getData_de_envio() {
        return data_de_envio;
    }

    public void setData_de_envio(Date data_de_envio) {
        this.data_de_envio = data_de_envio;
    }

    @Override
    public String toString() {
        return "Reacao{" +
                "id=" + id +
                ", colaborador_remetente=" + colaborador_remetente +
                ", colaborador_destinatario=" + colaborador_destinatario +
                ", reacao=" + reacao +
                ", data_de_envio=" + data_de_envio +
                '}';
    }
}
