package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

interface I1{
    void f1();
    void g1();
}

interface I2{
    void f2();
    void g2();
}

interface I3{
    void f3();
    void g3();
}

interface Multiple extends I1,I2,I3{
    void h();
}

abstract class Concrete{
    String s;

    public Concrete(String s) {
        this.s = s;
    }
}

class All extends Concrete implements Multiple{

    public All(String s) {
        super(s);
    }

    @Override
    public void h() {

    }

    @Override
    public void f1() {

    }

    @Override
    public void g1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void g2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void g3() {

    }
}

public class Exercise14 {
    static void one(I1 i){
        i.f1();
        i.g1();
    }

    static void two(I2 i){
        i.f2();
        i.g2();
    }

    static void three(I3 i){
        i.f3();
        i.g3();
    }

    static void four(Multiple m){
        m.h();
    }

    public static void main(String[] args) {
        All all = new All("all");
        one(all);
        two(all);
        three(all);
        four(all);
    }
}
