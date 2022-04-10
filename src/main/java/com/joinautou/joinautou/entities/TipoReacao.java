package com.joinautou.joinautou.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TipoReacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 64)
    private String reacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReacao() {
        return reacao;
    }

    public void setReacao(String reacao) {
        this.reacao = reacao;
    }

    @Override
    public String toString() {
        return "TipoReacao{" +
                "id=" + id +
                ", reacao='" + reacao + '\'' +
                '}';
    }
}
