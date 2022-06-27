package com.FunecMain.Projeto.Form;

import com.FunecMain.Projeto.Model.Cliente;
import com.FunecMain.Projeto.Repository.ClienteRepository;

public class ClienteForm {

    private Long id;

    private String nome;

    private String lagradouro;

    private String bairro;

    private String cep;

    private String estado;

    private int telefone;

    public Cliente conversorCliente() {
                setNome(this.nome);
                setLagradouro(this.lagradouro);
                setBairro(this.bairro);
                setCep(this.cep);
                setEstado(this.estado);
                setTelefone(this.telefone);
                return new Cliente();
    }

    public ClienteForm() {
    }

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
