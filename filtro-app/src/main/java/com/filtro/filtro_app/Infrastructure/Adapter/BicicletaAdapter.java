package com.filtro.filtro_app.Infrastructure.Adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filtro.filtro_app.Application.Service.IBicicletaService;
import com.filtro.filtro_app.Domain.Entities.Bicicleta;
import com.filtro.filtro_app.Infrastructure.Repositories.BicicletaRepository;

@Service
public class BicicletaAdapter implements IBicicletaService{
    @Autowired
    private BicicletaRepository productrepository;

    @Override
    public Optional<Bicicleta> findById(Long id) {
        return productrepository.findById(id);
    }

    @Override
    public List<Bicicleta> getAll() {
        return productrepository.findAll();
    }

    @Override
    public Bicicleta save(Bicicleta product) {
        return productrepository.save(product);
    }

    @Override
    public Bicicleta update(Long id, Bicicleta Bicicleta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
