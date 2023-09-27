/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.posttest1;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Posttest1 {
    
    public static void main(String[] args) {
        ArrayList<warnet> warnets = new ArrayList();
        
        warnets.add(new warnet("pagi", "3 jam",  5000));
        warnets.add(new warnet("siang", "4 jam",  10000));
        warnets.add(new warnet("sore", "3 jam",  4500));
        warnets.add(new warnet("malam", "6 jam",  15000));
        warnets.add(new warnet("subuh", "24 jam",  100000));
        
        for (warnet Warnet : warnets) {
            String pernyataan = " Warnet " +  Warnet.getPaket()  + " dengan durasi "  + Warnet.getJam()  + " dengan harga " +  Warnet.getHarga(); 
            System.out.println(pernyataan);
        }
    }
    
}
