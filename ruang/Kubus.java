/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class Kubus {
 int sisi;
double  volume;
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
   
   public double ComputeAndSetVolume(){
       volume = this.sisi * this.sisi * this.sisi;
       return volume;
   }
   public double  GetVolume(){
       return ComputeAndSetVolume();
}
}
