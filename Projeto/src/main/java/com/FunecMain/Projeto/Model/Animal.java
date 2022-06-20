package com.FunecMain.Projeto.Model;

import com.FunecMain.Projeto.Enums.SexoAnimal;
import com.FunecMain.Projeto.Enums.TipoEspecie;

import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_animal;

    private String nome;

    private int idade;

    private int peso;

    @Enumerated(value = EnumType.STRING)
    private SexoAnimal sexo;

    @Enumerated(value = EnumType.STRING)
    private TipoEspecie especie;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente tutoranimal;

    @OneToOne
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Long getId_animal() {
        return id_animal;
    }

    public void setId_animal(Long id_animal) {
        this.id_animal = id_animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public TipoEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(TipoEspecie especie) {
        this.especie = especie;
    }

    public Cliente getTutoranimal() {
        return tutoranimal;
    }

    public void setTutoranimal(Cliente tutoranimal) {
        this.tutoranimal = tutoranimal;
    }
}
