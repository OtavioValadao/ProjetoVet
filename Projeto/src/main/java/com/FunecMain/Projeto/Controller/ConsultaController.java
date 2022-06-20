package com.FunecMain.Projeto.Controller;

import com.FunecMain.Projeto.Model.Consulta;
import com.FunecMain.Projeto.Repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> consultas(){
        return consultaRepository.findAll();
    }
}
