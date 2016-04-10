package c10;

/**
 * Created by SuSong on 2015-01-04 20:28.
 */

class Outer {

    private String str;

    public Outer(String str) {
        this.str = str;
    }

    public Inner getInner() {
        return new Inner();
    }

    public class Inner {
        public String toString(){
            return str;
        }
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer("Out").getInner();
        System.out.println(inner.toString());
    }
}
