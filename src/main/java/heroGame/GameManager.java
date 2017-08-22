package heroGame;

public class GameManager {
    void fight(Character c1, Character c2){
        // to provide fight between to characters and explain
        // via command line what happens during the fight, till both of the characters are alive

        System.out.println("*******************");
        System.out.println("*****> FIGHT <*****");
        System.out.println("*******************");
        System.out.println(c1 + " <-- VS --> " + c2);
        System.out.println("------ START ------");
        int round = 0;
        while (c1.isAlive() && c2.isAlive()) {
            round++;
            System.out.println("Round: " + round);

            c1.kick(c2);
            System.out.println(c1 + " -- " + c2);

            if (!(c1.isAlive() && c2.isAlive())) break;
            c2.kick(c1);
            System.out.println(c1 + " -- " + c2);
        }
    }
}
