package com.corso.MicroservizioMoto.controller;

import com.corso.MicroservizioMoto.entity.Bike;
import com.corso.MicroservizioMoto.repo.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/bikes")
public class bikeController {



    @Autowired
    private BikeRepository bikeRepository;

    // CREATE - Aggiungi una nuova moto
    @PostMapping
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        // Se createdAt è null, impostazioneLocale con la data/ora attuale
        if (bike.getCreatedAt() == null) {
            bike.setCreatedAt(LocalDateTime.now());
        }
        Bike savedBike = bikeRepository.save(bike);
        return ResponseEntity.ok(savedBike);
    }

    // READ ALL - Preleva tutte le moto
    @GetMapping
    public ResponseEntity<List<Bike>> getAllBikes() {
        List<Bike> bikes = bikeRepository.findAll();
        return ResponseEntity.ok(bikes);
    }

    // READ BY ID - Preleva una moto specifica
    @GetMapping("/{id}")
    public ResponseEntity<Bike> getBikeById(@PathVariable Long id) {
        return bikeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // UPDATE - Aggiorna una moto esistente
    @PutMapping("/{id}")
    public ResponseEntity<Bike> updateBike(@PathVariable Long id, @RequestBody Bike bikeDetails) {
        return bikeRepository.findById(id)
                .map(bike -> {
                    ike.setName(bikeDetails.getName());
                    ike.setPrice(bikeDetails.getPrice());
                    // Il createdAt NON viene aggiornato (updatable = false)
                    Bike updatedBike = bikeRepository.save(ike);
                    return ResponseEntity.ok(updatedBike);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - Cancella una moto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBike(@PathVariable Long id) {
        if (bikeRepository.existsById(id)) {
            bikeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

