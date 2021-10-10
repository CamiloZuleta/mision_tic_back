package com.example.demo.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "category_id")
public class Category {

    @Id
    @SequenceGenerator(name="seq", sequenceName = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String description;


    public Category(String nombre, String description) {
        this.nombre = nombre;
        this.description = description;
    }

    public Category(){}

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
