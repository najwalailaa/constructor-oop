/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class Balok {
 int panjang, lebar, tinggi;
double volume;
 public void setPanjang(int panjang){
     this.panjang = panjang;
 }
 public int getPanjang(){
     return panjang;
 }
 public void setLebar(int lebar){
     this.lebar = lebar;
 }
 public int getLebar(){
     return lebar;
 }
 public void setTinggi(int tinggi){
     this.tinggi = tinggi;
 }
 public int getTinggi(){
     return tinggi;
 }
   public double ComputeAndSetVolume(){
       volume = this.panjang*this.lebar*this.tinggi;
       return volume;
   }
   public double  GetVolume(){
       return ComputeAndSetVolume();
   }
    
}
