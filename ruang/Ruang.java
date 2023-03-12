/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class Ruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Kubus a = new Kubus();
    a.sisi=10;
    
        System.out.println("=============================");
        System.out.println("sisi kubus: "+a.sisi);
        System.out.println("Volume Kubus: "+a.GetVolume());
        
    Balok b = new Balok();
    b.panjang = 5;
    b.lebar = 10;
    b.tinggi = 15;
    
        System.out.println("=============================");
        System.out.println("panjang balok: "+b.panjang);
        System.out.println("lebar balok: "+b.lebar);
        System.out.println("tinggi balok: "+b.tinggi);
        System.out.println("Volume balok: "+b.GetVolume());
  
   Tabung c = new Tabung();
   c.radius = 14;
   c.tinggi = 10;
   
        System.out.println("=============================");
        System.out.println("radius tabung: "+c.radius);
        System.out.println("tinggi tabung: "+c.tinggi);
        System.out.println("Volume tabung: "+c.getVolume());
        
   LimasSegiempat d = new LimasSegiempat();
   d.sisi = 10;
   d.tinggi = 10;
   
        System.out.println("=============================");
        System.out.println("sisi alas limas: "+d.sisi);
        System.out.println("tinggi limas: "+d.tinggi);
        System.out.println("Volume limas segiempat: "+d.getVolume());
        
   Bola e = new Bola();
   e.radius = 14;
   
        System.out.println("=============================");
        System.out.println("radius bola: "+e.radius);
        System.out.println("Volume bola: "+e.getVolume());
    }
}
