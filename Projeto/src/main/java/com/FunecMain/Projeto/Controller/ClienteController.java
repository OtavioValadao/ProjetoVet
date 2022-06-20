package com.FunecMain.Projeto.Controller;

import com.FunecMain.Projeto.DTO.ClienteDTO;
import com.FunecMain.Projeto.Model.Cliente;
import com.FunecMain.Projeto.Repository.AnimalRepository;
import com.FunecMain.Projeto.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> cliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(new ClienteDTO(cliente.get()));
        }
        return ResponseEntity.notFound().build();
    }


}
