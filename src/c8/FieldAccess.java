package c8;

/**
 * Created by SuSong on 2014/12/27 0027.
 */


class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperFiled() {
        return super.field;
    }
}


public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();//向上转型
        System.out.println("sup.field = " + sup.field + //
                ", sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field +//
                ", sub.getField() = " + sub.getField() +//
                ", sub.getSuperFiled() = " + sub.getSuperFiled());

    }
}
/*
    sup.field = 0, sup.getField() = 1
    sub.field = 1, sub.getField() = 1, sub.getSuperFiled() = 0
 */