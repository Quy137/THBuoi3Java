/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wys.Dao
 */
public class Order  {
    Scanner sc = new Scanner(System.in);
    ArrayList<OrderDetail> list = new ArrayList<>();
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail lineitems;

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderDetail getLineitems() {
        return lineitems;
    }

    
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public void addLineItem(Product p, int x) {
        lineitems.add(new OrderDetail(x,p));
    }

    @Override
    public String toString() {
        return "Order{" + "sc=" + sc + ", list=" + list + ", orderID=" + orderID + ", orderDate=" + orderDate + ", lineitems=" + lineitems + '}';
    }

    

   
    public double calcToalChange() {
        double tong = 0.0;
        for(OrderDetail items: list) {
            tong += items.calcTotalPrice();
        }
        return tong;
    }
    
    public void nhap(int n) {
        int x;
        for(int i = 0; i < n; i++) {
            System.out.println("1. Nhap vao san pham");
            System.out.println("0. Thoat");
            x = sc.nextInt(); sc.nextLine();
            if (x==1) {
                System.out.println("Nhap ma san pham :");
                String productID =sc.nextLine();
                System.out.println("Nhap mo ta san pham: ");
                String description = sc.nextLine();
                System.out.println("Nhap gia san pham");
                double price = sc.nextDouble(); sc.nextLine();
                System.out.println("Nhap so luong: ");
                int quatity = sc.nextInt(); sc.nextLine();
                OrderDetail od = new OrderDetail(quatity, lineitems, description, productID);
                list.add(od);
            } 
            else if (x ==0){
                break;
            } else {
                System.out.println("Nhap sai nhap lai");
                i--;
            }
        }
    }
    public void xuat() {
        if(list.isEmpty()) {
            System.out.println("rong");
        } else {
            System.out.println("Ma HD:" + this.orderID);
            System.out.println("Ngay lap hoa don: " + this.getOrderDate());
            System.out.println(String.format("| %-15s | %-20s | %-15s | %-15s | %-20s |%n","Ma SP", "Mo ta","Don Gia", "Thanh tien") +
                    "------------------------------------" +"\n");
        }for (OrderDetail od : list) {
            System.out.println(od);
        }
        System.out.println("Tong tien thanh toan : " + calcToalChange());
    }
}
