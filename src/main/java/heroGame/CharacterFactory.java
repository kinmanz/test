package heroGame;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CharacterFactory {

    private static CharacterFactory instance = new CharacterFactory();
    private static List<Supplier<Character>> heroes = new ArrayList<>();

    static {
        heroes.add(Knight::new);
        heroes.add(King::new);
        heroes.add(Elf::new);
        heroes.add(Hobbit::new);
    }

    private CharacterFactory() {}

    public static Character createCharacter() {
        int r = RandomProvider.getRandom(heroes.size());
        return heroes.get(r).get();
    }

}
