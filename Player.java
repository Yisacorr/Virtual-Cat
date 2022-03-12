/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author Yisacor
 */
public class Player {
    private int hp;
    
    public Player(){
     hp = 10;
    }
    
    public int getHp(){
        return hp;
    }
    public void takeDamage(int d){
       if (hp>0){
        if (hp>d) {    
             hp-=d;
         }

         if(hp<d){
             hp =0; 
        }  
    }
}
    @Override
    public String toString(){
        return("You have " + hp + "/" + "10 " + "HP");}
}
