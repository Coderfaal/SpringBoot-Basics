package com.tcs.springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Headache")
public class Product {

    @Id
    Long pid;

    String description;
    @Column(name = "purchasedOn")
    String purchasedOn;
    int qty;
    double price;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurchasedOn() {
        return purchasedOn;
    }

    public void setPurchasedOn(String purchased) {
        this.purchasedOn = purchasedOn;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", description='" + description + '\'' +
                ", purchasedOn=" + purchasedOn +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
