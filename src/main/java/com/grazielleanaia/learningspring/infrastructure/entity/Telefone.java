package com.grazielleanaia.learningspring.infrastructure.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "telefone")

public class Telefone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "ddd")
    private String ddd;

    public Telefone() {
    }

    public Telefone(Long id, String numero, String ddd) {
        this.id = id;
        this.numero = numero;
        this.ddd = ddd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
