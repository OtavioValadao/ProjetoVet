package com.FunecMain.Projeto.Repository;

import com.FunecMain.Projeto.Model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
    Vet findByNome(String nomeVet);
}
