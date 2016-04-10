package c10;

/**
 * Created by SuSong on 2015-01-07 0:28.
 */

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

public class Exercise16 {

    public static void RideCycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        RideCycle(new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Cycle() {
                    @Override
                    public void ride() {
                        System.out.println("Unicycle.ride()");
                    }
                };
            }
        });

        RideCycle(new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Cycle() {
                    @Override
                    public void ride() {
                            System.out.println("Bicycle.ride()");
                    }
                };
            }
        });

        RideCycle(new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Cycle() {
                    @Override
                    public void ride() {
                        System.out.println("Tricycle.ride()");
                    }
                };
            }
        });
    }
}
