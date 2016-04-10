package c10;

/**
 * Created by SuSong on 2015-01-07 0:22.
 */


interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move())
            ;
    }

    public static void main(String[] args) {
        playGame(new GameFactory() {
            @Override
            public Game getGame() {
                return new Game() {
                    int moves = 0;
                    static final int MOVES = 3;

                    @Override
                    public boolean move() {
                        System.out.println("Checkers move " + moves);
                        return ++moves != MOVES;
                    }
                };
            }
        });

        playGame(new GameFactory() {
            @Override
            public Game getGame() {
                return new Game() {
                    int moves = 0;
                    static final int MOVES = 4;

                    @Override
                    public boolean move() {
                        System.out.println("Chess move " + moves);
                        return ++moves != MOVES;
                    }
                };
            }
        });
    }

}
