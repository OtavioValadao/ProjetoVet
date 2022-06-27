package com.FunecMain.Projeto.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @OneToMany(mappedBy = "tutoranimal")
    private List<Animal> nomedoanimal;

    private String nome;

    private String lagradouro;

    private String bairro;

    private String cep;

    private String estado;

    private int telefone;

    public Cliente() {
    }

    public Cliente(String nome, String lagradouro, String bairro, String cep, String estado, int telefone) {
    }

    public Cliente(Long id_cliente, List<Animal> nomedoanimal, String nome, String lagradouro, String bairro,
                   String cep, String estado, int telefone) {
        this.id_cliente = id_cliente;
        this.nomedoanimal = nomedoanimal;
        this.nome = nome;
        this.lagradouro = lagradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.telefone = telefone;
    }

    public List<Animal> getNomedoanimal() {
        return nomedoanimal;
    }

    public void setNomedoanimal(List<Animal> nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
