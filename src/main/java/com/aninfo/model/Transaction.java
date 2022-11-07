package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long cbu;

    private Double sum;

    private String type;

    public Transaction(){
    }

    public Transaction(Long cbu, Double sum, String type) {
        this.cbu = cbu;
        this.sum = sum;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double balance) { this.sum = sum; }

    public String getType() {
        return type;
    }

    public void setType(String type) { this.type = type; }

}
