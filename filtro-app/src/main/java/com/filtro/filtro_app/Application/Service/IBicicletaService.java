package com.filtro.filtro_app.Application.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.filtro.filtro_app.Domain.Entities.Bicicleta;

@Service
public interface IBicicletaService {

    Optional<Bicicleta> findById(Long id);

    List<Bicicleta> getAll();

    Bicicleta save(Bicicleta bicicleta);

    Bicicleta update(Long id, Bicicleta Bicicleta);

    void deleteById(Long id);
    

}
