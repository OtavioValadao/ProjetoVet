package com.FunecMain.Projeto.Form;

import com.FunecMain.Projeto.Model.Animal;
import com.FunecMain.Projeto.Model.Cliente;
import com.FunecMain.Projeto.Model.Consulta;
import com.FunecMain.Projeto.Model.Vet;
import com.FunecMain.Projeto.Repository.AnimalRepository;
import com.FunecMain.Projeto.Repository.ClienteRepository;
import com.FunecMain.Projeto.Repository.VetRepository;

import java.time.LocalDateTime;

public class ConsultaForm {

    private String nomeCliente;

    private String nomeAnimal;

    private String nomeVet;

    private LocalDateTime data = LocalDateTime.now();

    public Consulta conversor(ClienteRepository clienteRepository,
                                 AnimalRepository animalRepository,
                                 VetRepository vetRepository) {
        Cliente cliente = clienteRepository.findByNome(this.nomeCliente);
        Animal animal = animalRepository.findByNome(this.nomeAnimal);
        Vet vet = vetRepository.findByNome(this.nomeVet);
        return new Consulta(cliente, animal, vet, data);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeVet() {
        return nomeVet;
    }

    public void setNomeVet(String nomeVet) {
        this.nomeVet = nomeVet;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
