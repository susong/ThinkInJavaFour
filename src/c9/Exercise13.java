package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

interface One{
    void f();
}

interface Two extends One{
    void f();
}

interface Three extends One{
    void f();
}

interface Four extends Two,Three{
    void f();
}

class Five implements Four{
    @Override
    public void f() {
        System.out.println("Five.f()");
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        new Five().f();
    }
}
