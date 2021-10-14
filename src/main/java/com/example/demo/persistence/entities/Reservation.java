package com.example.demo.persistence.entities;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date startDate;
    private Date devolutionDate;
    private String Status;
    private Date createdDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="idClient")
    private Client client;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="cabinId")
    private Cabin cabin;

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
