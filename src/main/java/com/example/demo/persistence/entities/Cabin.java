package com.example.demo.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name="cabin")
public class Cabin {

    @Id
    @SequenceGenerator(name="seq", sequenceName = "seq")
    private Long id;
    @Column
    private String brand;
    @Column
    private String name;
    @Column
    private Integer rooms;
    @Column
    private String description;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Cabin(String brand, String name, Integer rooms, String description, Category category) {
        this.brand = brand;
        this.rooms = rooms;
        this.category = category;
        this.name = name;
        this.description = description;
    }

    public Cabin(){}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Integer getRooms() {
        return rooms;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }
}
