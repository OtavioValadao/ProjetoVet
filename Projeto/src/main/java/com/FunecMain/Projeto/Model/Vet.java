package com.FunecMain.Projeto.Model;

import javax.persistence.*;

@Entity
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vet;

    private String nome;

    private int contato;

    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consulta agendaconsulta;

    public Long getId_vet() {
        return id_vet;
    }

    public void setId_vet(Long id_vet) {
        this.id_vet = id_vet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public Consulta getAgendaconsulta() {
        return agendaconsulta;
    }

    public void setAgendaconsulta(Consulta agendaconsulta) {
        this.agendaconsulta = agendaconsulta;
    }
}
