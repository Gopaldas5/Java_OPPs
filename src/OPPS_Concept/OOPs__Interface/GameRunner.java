package OPPS_Concept.OOPs__Interface;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};   //polymorphism

        // GamingConsole game = new MarioGame();
        //GamingConsole game = new ChessGame();
        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();

        }
    }
}
