/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class LimasSegiempat {
int sisi, tinggi;
double volume;
public void setSisi(int sisi){
    this.sisi = sisi;
}
public int getSisi(){
    return sisi;
}
public void setTinggi(int tinggi){
    this.tinggi = tinggi;
}
public int getTinggi(){
    return tinggi;
}
public double ComputeAndSetVolume(){
    volume = 0.334  * this.tinggi * this.sisi * this.sisi;
    return volume;
}
public double getVolume(){
    return ComputeAndSetVolume();
}
}
