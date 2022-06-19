/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidprinciple;

/**
 *
 * @author hassa
 */
public class Magician extends Character {
    public double power;
    public Magician(double p){
        this.power=p;
    }
    public  void move(){
    
    }
   public  double attack(){
       return this.power;
   }
    public void defend(){
        
    }
}