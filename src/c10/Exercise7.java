package c10;

/**
 * Created by SuSong on 2015-01-04 21:54.
 */

class AA {
    private int a;

    private void add() {
        System.out.println("AA.add() " + a);
    }

    class BB {
        void changeA() {
            add();
            a++;
        }
    }

    public void query() {
        new BB().changeA();
        System.out.println("a = " + a);
    }
}


public class Exercise7 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.query();
    }
}
