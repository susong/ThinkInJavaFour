package c2;

/**
 * Created by SuSong on 2014/11/30 0030.
 */
public class Exercise7 {

    static int i = 47;

    static void increment() {
        Exercise7.i++;
    }

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        exercise7.increment();
        System.out.println(i);
        Exercise7.increment();
        System.out.println(i);
        increment();
        System.out.println(i);
    }
}
