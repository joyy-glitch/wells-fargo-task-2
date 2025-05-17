package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {  
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioDescription;

    @OneToOne
    @JoinColumn(name = "clientId", referencedColumnName = "clientId")
    private Client client;
    protected Portfolio() {

    }
    public  Portfolio(String portfolioDescription) {
        this.portfolioDescription = portfolioDescription;

    }
    public long getPortfolioId() {return portfolioId; }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }
}
