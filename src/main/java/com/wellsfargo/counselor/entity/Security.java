package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityCategory;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @OneToOne
    @JoinColumn(name = "portfolioId", referencedColumnName = "portfolioId")
    private Portfolio portfolio;

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }
}
