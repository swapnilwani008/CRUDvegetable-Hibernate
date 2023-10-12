//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.Swapnil.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vegetable")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    // Constructors

    public Vegetable() {
        super();
        // Default constructor
    }

    public Vegetable(String name, double price) {
        super();
        
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Additional methods

    @Override
    public String toString() {
        return "Vegetable [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
