package heroGame;

public class Knight extends Character {

    public Knight() {
        hp = 2 + RandomProvider.getRandom(10) + 1;
        power = 2 + RandomProvider.getRandom(10) + 1;
    }

    @Override
    public void kick(Character enemy) {
        enemy.hit(RandomProvider.getRandom(power) + 1);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
