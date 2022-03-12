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
public class Tabby extends Cat {

    public Tabby(String n) {
        super("tabby");
    }

    /**
     * Test if Tabby will eat when they are hungry, if not they attack the user.
     *
     * @param p
     * @return string
     */
    @Override
    public String feed(Player p) {
        if (hunger <= 3) {
            return (name + " is pretty hungry, and starts chomping down the food right away.");
        }
        if (hunger >= 8) {
            p.takeDamage(3);
            return (name + " is already full, and bites and scratches you for insulting them with food. You take 3 damage.");

        } else {
            int rand = (int) (Math.random() * (2) + 1);
            if (rand == 1) {
                return (name + " ate the food you gave them.");
            } else {
                p.takeDamage(3);
                return (name + " scratches you for giving them a food they dont like for 3 damage.");
            }
        }

    }

    /**
     * Test if Tabby is too hungry and will cause damage if a user tries to play
     * with them while hungry
     *
     * @param p
     * @return string about the interaction
     */
    @Override
    public String play(Player p) {
        if (hunger <= 3) {
            p.takeDamage(4);
            return (name + " is pretty hungry, and bites and scratches you for trying to play with them while their hungry. You take 4 damage.");
        } else if (hunger >= 8) {
            return (name + "  is so full, they can barely roll over to glare at you when you roll a jingle ball toward them.");

        } else {
            int rand = (int) (Math.random() * (2) + 1);
            if (rand == 1) {
                return (name + " happily played with you.");
            } else {
                p.takeDamage(2);
                return (name + " jumps and plays with the string you dangle in front of them" + name + " accidentally scratches you for 2 damage.");
            }
        }
    }

    /**
     * * Test if Tabby is hungry, then they will attack the user.If it is full,
     * they will purr and fall asleep.
     *
     * @param p
     * @return representation of the interaction.
     */
    @Override
    public String pet(Player p) {
        if (hunger <= 3) {
            p.takeDamage(4);
            return (name + " is pretty hungry, and bites and scratches you for trying to pet them while they're hungry. You take 4 damage.");
        } else {
            int rand = (int) (Math.random() * (2) + 1);
            if (rand == 1) {
                return (name + " happily allows you to pet them.");
            } else {
                p.takeDamage(2);
                return (name + " accidentally scratches you while rolling for 2 damage.");
            }
        }
    }
}
