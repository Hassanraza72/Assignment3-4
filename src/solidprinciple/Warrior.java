/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidprinciple;

/**
 *
 * @author hassa
 */
public class Warrior extends Character {
    public double power;
    
    public Warrior(double p){
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
