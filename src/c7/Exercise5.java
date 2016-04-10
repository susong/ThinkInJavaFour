package c7;

/**
 * Created by SuSong on 2014/12/16 0016.
 */
class A {
    public A(String s) {
        System.out.println("A " + s);
    }
}

class B {
    public B(String s) {
        System.out.println("B " + s);
    }
}

class C extends A {


    public B b;

    public C(String s) {
        super(s);
        b = new B(s);
        System.out.println("C " + s);
    }
}


public class Exercise5 {
    public static void main(String[] args) {
        new C("hello");
    }
}

/*
    output:
    A
    B
    C
 */
