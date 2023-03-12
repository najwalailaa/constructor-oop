/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class Tabung {
    int radius, tinggi;
double volume;
 public void setRadius(int radius){
     this.radius = radius;
 }
 public int getPanjang(){
     return radius;
 }
 public void setTinggi(int tinggi){
    this.tinggi = tinggi;
 }
 public int getTinggi(){
     return tinggi;
 }
   public double ComputeAndSetVolume(){
       volume = 3.14 * this.radius * this.radius * this.tinggi;
       return volume;
   }
   public double  getVolume(){
       return ComputeAndSetVolume();
   }
}
