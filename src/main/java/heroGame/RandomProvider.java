package heroGame;

import java.util.Random;

public class RandomProvider {

    private static Random random = new Random();

    public static int getRandom(int rightBound) {
        return random.nextInt(rightBound);
    }

}
