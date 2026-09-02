/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author WORKPLUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        System.out.println("_______________________________");
        
        Hewan anjing = new Hewan("Boni", 5);
        anjing.info();
        anjing.berlari();
    }
    
}
