package com.FunecMain.Projeto.DTO;

import com.FunecMain.Projeto.Model.Animal;
import com.FunecMain.Projeto.Model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteDTO {
    private List<AnimalDTO> animaisCliente;

    private String nomecliente;

    private int telefone;


    public ClienteDTO(Cliente cliente){
        this.nomecliente = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.animaisCliente = new ArrayList<>();
        this.animaisCliente.addAll(cliente.getNomedoanimal().stream().map(AnimalDTO::new).collect(Collectors.toList()));
    }

    public List<AnimalDTO> getAnimaisCliente() {
        return animaisCliente;
    }

    public void setAnimaisCliente(List<AnimalDTO> animaisCliente) {
        this.animaisCliente = animaisCliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
