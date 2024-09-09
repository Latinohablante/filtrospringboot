package com.filtro.filtro_app.Infrastructure;

import org.springframework.web.bind.annotation.RestController;

import com.filtro.filtro_app.Application.Service.IBicicletaService;
import com.filtro.filtro_app.Domain.Entities.Bicicleta;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/bicicleta")
public class BicicletaController {

    @Autowired
    private IBicicletaService bicicletaService;

    @GetMapping
    public List<Bicicleta> listBicicletas(){
        return bicicletaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Bicicleta> show(@PathVariable Long id) {
        return bicicletaService.findById(id);
    }

    @PostMapping("")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
}
