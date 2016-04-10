package c5;

/**
 * Created by SuSong on 2014/12/13 0013.
 */
public class Exercise13 {


    public static void main(String[] args) {
        System.out.println("inside main");
        Cups.cup1.f(99);
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}