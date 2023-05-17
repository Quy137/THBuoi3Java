/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.time.LocalDate;

/**
 *
 * @author Wys.Dao
 */
public class testOrder {
    public static void main(String[] args) {
        Order or = new Order(1, LocalDate.of(2015,9,10));
        
        or.nhap(1);
        or.xuat();
        or.calcToalChange();
        
    }
}
