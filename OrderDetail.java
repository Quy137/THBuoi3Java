/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author Wys.Dao
 */
public class OrderDetail extends Product {
    private int quatity;
    public Product product;

    public OrderDetail(int quatity, Product product) {
        this.quatity = quatity;
        this.product = product;
    }

    public OrderDetail(int quatity, Product product, String description, String prodictID) {
        super(description, prodictID);
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);
        String dongia = nf.format(product.getPrice());
        String thanhtien = nf.format(calcTotalPrice());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("|%-15s | %-20s | %-15d | %-20s| %-20s |%n", product.getProdictID(),product.getDescription(),this.quatity,dongia,thanhtien);
    }
    
    public double calcTotalPrice() {
        return this.getQuatity()* this.product.getPrice();
    }

    void add(OrderDetail orderDetail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
