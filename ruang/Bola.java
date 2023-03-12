/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Najwa
 */
public class Bola {
 int radius, phi;
 double volume;
 public void setRadius(int radius){
     this.radius = radius;
 }
 public int getRadius(){
     return radius;
 }
 public double ComputeAndSetVolume(){
     volume = 4/3 * 3.14 * this.radius * this.radius * this.radius;
     return volume;
 }

 public double getVolume(){
     return ComputeAndSetVolume();
 }
}
