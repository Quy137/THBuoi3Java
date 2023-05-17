/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author Wys.Dao
 */
public class Product {
    private String description;
    private String prodictID;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProdictID() {
        return prodictID;
    }

    public void setProdictID(String prodictID) {
        this.prodictID = prodictID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String description, String prodictID) {
        this.description = description;
        this.prodictID = prodictID;
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", prodictID=" + prodictID + ", price=" + price + '}';
    }
    
    
}
