package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

abstract class A{
    abstract void query();
}

class B extends A{


    void query(){
        System.out.println("B.query()");
    }
}

public class Exercise4 {

    public static void test(A a){
//        ((B)a).query();
        a.query();
    }

    public static void main(String[] args) {
        A a = new B();
        test(a);
    }
}
