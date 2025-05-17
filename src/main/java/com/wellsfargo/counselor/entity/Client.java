package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String clientEmail;

    @Column(nullable = false)
    private String clientAddress;

    protected Client() {}

    public Client( String clientName, String clientAddress, String clientEmail ) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;

    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
}
