/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidprinciple;

/**
 *
 * @author hassa
 */
public class Fighting {
    Character c;
    
    
    void startFight(Character human,Character computerPlayer){
       
         if( human.attack()>computerPlayer.attack()){
             System.out.println("human wins");
         }
         else
             System.out.println("Computer wins");
     }
      
}
