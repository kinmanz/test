package heroGame;

public class King extends Knight {
    public King() {
        hp += 2;
        power += 2;
    }

    @Override
    public String toString() {
        return "King{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
