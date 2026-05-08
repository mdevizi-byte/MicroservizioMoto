package com.corso.MicroservizioMoto.services;

import com.corso.MicroservizioMoto.entity.Bike;
import com.corso.MicroservizioMoto.repo.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {

    private final BikeRepository repository;

    public BikeService(BikeRepository repository) {
        this.repository = repository;
    }

    public List<Bike> findAll() {
        return repository.findAll();
    }

    public Optional<Bike> findById(Long id) {
        return repository.findById(id);
    }

    public Bike save(Bike bike) {
        return repository.save(bike);
    }

    public Bike update(Long id, Bike updated) {
        return repository.findById(id)
            .map(existing -> {
                existing.setName(updated.getName());
                existing.setPrice(updated.getPrice());
                // createdAt non viene aggiornato (è immutabile)
                return repository.save(existing);
            })
            .orElseThrow(() -> new RuntimeException("Bike not found: " + id));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

