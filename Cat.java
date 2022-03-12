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
public abstract class Cat {
    String name;
    int hunger;
    
    public Cat(String n){
        name = n;
        
    }
    public String getName(){return name;}
    public int getHunger(){
        hunger = (int) ((Math.random() * 10) + 1);
        return hunger;
    }
    public int incrementHunger(int val){
        getHunger();
        hunger = hunger + val;
        if (hunger < 0){
            hunger  = 1;
        }
        if (hunger > 10){
            hunger  = 10;
        }
        return hunger;
    }
    @Override
    public String toString(){
        if (hunger <= 3)
            return (name + " is hungry");
        if (hunger >= 8)
            return (name + " is full");
        return (name + " is satisfied");
    }
    public abstract String feed(Player p);
    public abstract String play(Player p);
    public abstract String pet(Player p);
}
