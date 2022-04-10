package com.joinautou.joinautou.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Entity
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Integer matricula;
    @Column(length = 64)
    private String nome;
    @Column(length = 64)
    private String sobrenome;
    @Column(length = 64)
    private String email;
    @Column(length = 256)
    private String departamento;
    @Column(length = 256)
    private String cargo;
    @Lob
    private Blob foto_colaborador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Blob getFoto_colaborador() {
        return foto_colaborador;
    }

    public void setFoto_colaborador(Blob foto_colaborador) {
        this.foto_colaborador = foto_colaborador;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "id=" + id +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", departamento='" + departamento + '\'' +
                ", cargo='" + cargo + '\'' +
                ", foto_colaborador=" + foto_colaborador +
                '}';
    }
}
