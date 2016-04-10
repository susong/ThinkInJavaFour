package c8;

/**
 * Created by SuSong on 2014/12/27 0027.
 */


class Base{
    public void one(){
        System.out.println("Base.one()");
        two();
    }

    public void two(){
        System.out.println("Base.two()");
    }
}

public class Exercise10 extends Base{

    @Override
    public void two() {
        System.out.println("sub.two()");
    }

    public static void main(String[] args) {
        Base base = new Exercise10();
        base.one();
    }
}
/*
    Base.one()
    sub.two()
 */