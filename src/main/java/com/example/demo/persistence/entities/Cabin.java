package com.example.demo.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name="cabin")
public class Cabin {

    @Id
    @SequenceGenerator(name="seq", sequenceName = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(cascade=CascadeType.MERGE, mappedBy="cabin")
    @JsonIgnore
    private List<Message> messages;

    @OneToMany(cascade=CascadeType.MERGE, mappedBy="cabin")
    @JsonIgnore
    private List<Reservation> reservations;

    public Cabin(String brand, String name, Integer rooms, String description, Category category) {
        this.brand = brand;
        this.rooms = rooms;
        this.category = category;
        this.name = name;
        this.description = description;
    }

    public Cabin(){}

    public Cabin(Long id){
        this.id = id;
    }

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

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
