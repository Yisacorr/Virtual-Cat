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
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player();

        System.out.println("Choose a kitty:");
        System.out.println("1. Tabby Cat");
        System.out.println("2. Ocelet");
        System.out.println("3. Tiger");
        int kitty_option = CheckInput.getIntRange(1, 3);

        System.out.print("Name your kitty: ");
        String kitty_name = CheckInput.getString();

        Cat kitty = null;
        switch (kitty_option) {
            case 1:
                kitty = new Tabby(kitty_name);
                break;
            case 2:
                kitty = new Ocelot(kitty_name);
                break;
            default:
                kitty = new Tiger(kitty_name);
                break;
        }
        interactCat(kitty, p1);
    }

    /**
     * Display the cat interaction menu and the corresponding cat method depends
     * on the use's input.
     *
     * @param c cat in the game
     * @param p player in the game
     */
    public static void interactCat(Cat c, Player p) {
        do {
            System.out.println(p.toString());
            System.out.println(c.toString());

            System.out.println("1. Feed your cat");
            System.out.println("2. Play with your cat");
            System.out.println("3. Pet your cat");
            int choice = CheckInput.getIntRange(1, 3);

            switch (choice) {
                case 1:
                    System.out.println(c.feed(p));
                    c.incrementHunger(10);
                    break;
                case 2:
                    System.out.println(c.play(p));
                    int randm = (int) (Math.random() * (7) + 2);
                    c.hunger -= randm;
                    break;
                default:
                    System.out.println(c.pet(p));
                    int randmn = (int) (Math.random() * (7) + 2);
                    c.hunger -= randmn;
                    break;
            }
        } while (p.getHp() > 0);
        if (p.getHp() <= 0) {
            System.out.println("\n==========================================");
            System.out.println("       Game over! You run out of HP");
            System.out.println("==========================================");
        }
    }
}
