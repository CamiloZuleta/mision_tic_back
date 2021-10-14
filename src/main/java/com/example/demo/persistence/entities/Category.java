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
    @Column(name = "name")
    private String name;
    @Column(name="description")
    private String description;


    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(){}

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
