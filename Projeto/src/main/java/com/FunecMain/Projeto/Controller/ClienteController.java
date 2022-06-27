package com.FunecMain.Projeto.Controller;

import com.FunecMain.Projeto.DTO.ClienteDTO;
import com.FunecMain.Projeto.Form.ClienteForm;
import com.FunecMain.Projeto.Model.Cliente;
import com.FunecMain.Projeto.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

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
    public ResponseEntity<ClienteDTO> clientes(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(new ClienteDTO(cliente.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastro")
    public Cliente cadastroCliente(@RequestBody ClienteForm clienteForm,
                                   UriComponentsBuilder uriComponentsBuilder){
        Cliente cadCliente = clienteForm.conversorCliente();
        return clienteRepository.save(cadCliente);

//        URI uri = uriComponentsBuilder.path("/cadastro/{id}").buildAndExpand(cadCliente.getId_cliente()).toUri();
//        return ResponseEntity.created(uri).body(new ClienteForm());
    }



}
