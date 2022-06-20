package com.FunecMain.Projeto.Repository;

import com.FunecMain.Projeto.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal findByNome(String nomeAnimal);
}
