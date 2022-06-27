package com.FunecMain.Projeto.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_consulta;

    private LocalDateTime data = LocalDateTime.now();

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "id_animal")
    private Animal id_animal;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_vet")
    private Vet id_vet;

    private String hitorico;


    public Consulta() {
    }

    public Consulta(Cliente cliente, Animal animal, Vet vet, LocalDateTime data) {
    }

    public Long getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Animal getId_animal() {
        return id_animal;
    }

    public void setId_animal(Animal id_animal) {
        this.id_animal = id_animal;
    }

    public Vet getId_vet() {
        return id_vet;
    }

    public void setId_vet(Vet id_vet) {
        this.id_vet = id_vet;
    }

    public String getHitorico() {
        return hitorico;
    }

    public void setHitorico(String hitorico) {
        this.hitorico = hitorico;
    }
}
