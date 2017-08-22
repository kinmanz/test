package heroGame;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        gameManager.fight(
                CharacterFactory.createCharacter(),
                CharacterFactory.createCharacter()
        );
    }
}
