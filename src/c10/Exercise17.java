package c10;

/**
 * Created by SuSong on 2015-01-07 0:33.
 */

interface Tossing {
    boolean event();
}

interface TossingFactory {
    Tossing getTossing();
}

public class Exercise17 {

    public static void simulate(TossingFactory tf){
        Tossing tossing = tf.getTossing();
        while (tossing.event()){

        }
    }

    public static void main(String[] args) {
        simulate(new TossingFactory() {
            @Override
            public Tossing getTossing() {
                return new Tossing() {

                    int events;
                    static final int EVENTS = 2;

                    @Override
                    public boolean event() {
                        System.out.println("Coin tossing event " + events);
                        return ++events != EVENTS;
                    }
                };
            }
        });

        simulate(new TossingFactory() {
            @Override
            public Tossing getTossing() {
                return new Tossing() {

                    int events;
                    static final int EVENTS = 6;

                    @Override
                    public boolean event() {
                        System.out.println("Dice tossing event " + events);
                        return ++events != EVENTS;
                    }
                };
            }
        });
    }
}
