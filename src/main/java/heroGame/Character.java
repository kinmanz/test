package heroGame;

public abstract class Character {
    protected int power;
    protected int hp;


    abstract public void kick(Character enemy);

    public boolean isAlive() {
        return hp > 0;
    }

    public void decPower(int val) {
        power -= val;
    }

    public void hit(int powerOfHit) {
        hp -= powerOfHit;
    }

    public void kill() {
        hp = 0;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Character{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
