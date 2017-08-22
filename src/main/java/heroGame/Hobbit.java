package heroGame;

public class Hobbit extends Character {

    public Hobbit() {
        hp = 3;
        power = 0;
    }

    @Override
    public void kick(Character enemy) {
        toCry();
    }

    void toCry() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!");
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
