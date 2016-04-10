package c10;

/**
 * Created by SuSong on 2015-01-07 21:30.
 */

interface Exe20Inter{
    class Exe20Imp{
        void f(){
            System.out.println("Imp.f()");
        }
    }
    class Exe20Imp2 implements Exe20Inter{
        static Exe20Imp2 get(){
            return new Exe20Imp2();
        }

        void f(){
            System.out.println("Imp2.f()");
        }
    }
}


public class Exercise20{
    public static void main(String[] args) {
        Exe20Inter.Exe20Imp2.get().f();
        new Exe20Inter.Exe20Imp().f();
    }
}
