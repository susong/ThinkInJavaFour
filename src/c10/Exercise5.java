package c10;

/**
 * Created by SuSong on 2015-01-04 21:23.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Outer outer = new Outer("outer");
        Outer.Inner inner = outer.new Inner();
    }
}
