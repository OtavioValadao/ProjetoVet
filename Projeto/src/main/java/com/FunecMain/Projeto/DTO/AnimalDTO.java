package com.FunecMain.Projeto.DTO;

import com.FunecMain.Projeto.Enums.SexoAnimal;
import com.FunecMain.Projeto.Enums.TipoEspecie;
import com.FunecMain.Projeto.Model.Animal;

public class AnimalDTO {

    private String nome;

    private TipoEspecie especie;

    private SexoAnimal sexo;

    public AnimalDTO(Animal animal) {
        this.nome = animal.getNome();
        this.especie = animal.getEspecie();
        this.sexo = animal.getSexo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(TipoEspecie especie) {
        this.especie = especie;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }
}
