package c10;

/**
 * Created by SuSong on 2015-01-10 22:22.
 */

class Exer26 {
    class Exer26Inter {

        int i;

        public Exer26Inter(int i) {
            this.i = i;
        }
    }
}

public class Exercise26 {

    class E26Inter extends Exer26.Exer26Inter {
        public E26Inter(Exer26 e, int i) {
            e.super(i);
        }

    }

    public static void main(String[] args) {

    }
}
