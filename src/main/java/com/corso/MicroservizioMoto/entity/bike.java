package com.corso.MicroservizioMoto.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bike", schema = "moto")
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // mappa la colonna `name` nel DB
    @Column(name = "name", nullable = false)
    private String name;

    // mappa la colonna `price` nel DB
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    // mappa la colonna `created_at` nel DB
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    public Bike() {
    }

    public Bike(String name, BigDecimal price, LocalDateTime createdAt) {
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
