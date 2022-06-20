package com.FunecMain.Projeto.Repository;

import com.FunecMain.Projeto.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByNome(String nomeCliente);
}
