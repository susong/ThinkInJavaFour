package c2;

/**
 * Created by SuSong on 2014/11/30 0030.
 */
public class Exercise8 {

    static int i=10;


    public static void main(String[] args) {
        Exercise8 e1 = new Exercise8();
        Exercise8 e2 = new Exercise8();
        System.out.println(e1.i+"=="+e2.i);
        i++;
        System.out.println(e1.i+"=="+e2.i);
    }
}
