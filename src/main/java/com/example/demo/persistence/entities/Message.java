package com.example.demo.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "messsage")
@Getter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "text_message")
    private String messageText;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="idClient")
    private Client client;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="cabinId")
    private Cabin cabin;

    public Message() {
    }

    public Message(String messageText, Client client, Cabin cabin){
        this.messageText = messageText;
        this.client = client;
        this.cabin = cabin;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
