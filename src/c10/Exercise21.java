package c10;

/**
 * Created by SuSong on 2015-01-07 21:35.
 */

interface Exe21Inter{

    void f();

    class Exe21Imp{
        static void get(Exe21Inter inter){
            inter.f();
            System.out.println("Exe21Imp.get()");
        }
    }
}

public class Exercise21 implements Exe21Inter{
    @Override
    public void f() {
        System.out.println("f");
    }

    public static void main(String[] args) {
        Exe21Inter.Exe21Imp.get(new Exercise21());
    }
}
