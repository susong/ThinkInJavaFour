package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

interface AnInterface{
    void a();
    void b();
    void c();
}

class AnClass implements AnInterface{
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    @Override
    public void c() {
        System.out.println("c");
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        AnInterface a = new AnClass();
        a.a();
        a.b();
        a.c();
    }
}
