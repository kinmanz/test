package heroGame;

public class Elf extends Character {

    public Elf() {
        power = 10;
        hp = 10;
    }

    @Override
    public void kick(Character enemy) {
        if (power > enemy.getPower()) {
            enemy.kill();
        } else {
            enemy.decPower(1);
        }
    }

    @Override
    public String toString() {
        return "Elf{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
