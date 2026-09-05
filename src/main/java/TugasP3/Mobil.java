/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP3;

/**
 *
 * @author WORKPLUS
 */
public class Mobil {
    private String Merk;
    private String Model;
    private int Tahun;
    private String Warna;
    
    public Mobil(String Merk, String Model, int Tahun, String Warna) {
        this.Merk = Merk;
        this.Model = Model;
        this.Tahun = Tahun;
        this.Warna = Warna;
    }
    public String getMerk() {
        return Merk;
    }
    public void setMerk(String Merk) {
        this.Merk = Merk;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public int getTahun() {
        return Tahun;
    }
    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
    public String getWarna() {
        return Warna;
    }
    public void setWarna(String Warna) {
        this.Warna =Warna;
    }
    //Method
    void displayInfo() {
        System.out.println("------------Info Mobil------------");
        System.out.println("Merk :" + Merk);
        System.out.println("Model : " + Model);
        System.out.println("Tahun : " + Tahun);
        System.out.println("Warna : " + Warna);
        System.out.println("==================================");
    }
    void startEngine() {
        System.out.println("Mesin mobi " + Merk + " Menyala");
    }
}
