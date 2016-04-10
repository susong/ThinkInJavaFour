package c10;

/**
 * Created by SuSong on 2015-01-07 0:04.
 */

abstract class Exe15 {
    int a;

    public Exe15(int a) {
        this.a = a;
    }

    public abstract void f();
}

public class Exercise15 {

    Exe15 getExe15(final int i) {
        return new Exe15(i) {

            {
                System.out.println("init() " + i);
            }

            @Override
            public void f() {
                System.out.println("f()");
            }
        };
    }

    public static void main(String[] args) {
        Exercise15 exercise15 = new Exercise15();
        exercise15.getExe15(12).f();
    }
}
