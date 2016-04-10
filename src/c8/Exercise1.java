package c8;

/**
 * Created by SuSong on 2014/12/27 0027.
 */


class Cycle {

    public static void ride(Cycle cycle) {
        System.out.println("ride " + cycle);
    }

    @Override
    public String toString() {
        return "Cycle";
    }
}

class Unicycle extends Cycle {
    public void balance(){
        System.out.println("Unicycle.balance()");
    }
    @Override
    public String toString() {
        return "Unicycle";
    }
}

class Bicycle extends Cycle {
    public void balance(){
        System.out.println("Bicycle.balance()");
    }
    @Override
    public String toString() {
        return "Bicycle";
    }
}

class Tricycle extends Cycle {
    @Override
    public String toString() {
        return "Tricycle";
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Cycle.ride(new Cycle());
        Cycle.ride(new Unicycle());
        Cycle.ride(new Bicycle());
        Cycle.ride(new Tricycle());


        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        ((Unicycle)tricycle).balance();
    }
}
