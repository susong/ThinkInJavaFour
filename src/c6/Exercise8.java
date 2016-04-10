package c6;

/**
 * Created by SuSong on 2014/12/15 0015.
 */
public class Exercise8 {

    int i = 10;

    private Exercise8() {
        System.out.println("i=" + i);
    }

    public static Exercise8 getInstance() {
        return new Exercise8();
    }
}
