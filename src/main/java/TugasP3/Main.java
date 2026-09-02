/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author WORKPLUS
 */
public class Main {
       public static void main(String[] args) {
        Mobil Keluarga = new Mobil("Toyota","Kijang Innova", 2012);
        Mobil Super = new Mobil("Aston Martin","Valhalla", 2026);
        
        Keluarga.displayInfo();
        
        Keluarga.setTahun(2015);
        Keluarga.displayInfo();
        
        Super.startEngine();
    }
}
