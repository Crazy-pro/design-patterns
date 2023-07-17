package alex.klimchuk.templatemethod;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        Game basketballGame = new BasketballGame();
        basketballGame.play();
    }
}
