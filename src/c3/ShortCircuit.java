package c3;

/**
 * Created by SuSong on 2014/12/5 0005.
 */
public class ShortCircuit {

    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }

    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }

    public static void main(String[] args) {
        boolean b = test1(1)||test2(1)||test3(2);
        System.out.println(b);
    }
}
