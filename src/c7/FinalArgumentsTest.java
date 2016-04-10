package c7;

/**
 * Created by SuSong on 2014/12/22 0022.
 */
public class FinalArgumentsTest {
    public static void main(String[] args) {
        FinalArgumentsTest fat = new FinalArgumentsTest();
        fat.set(1, 2);
        fat.set(3, 4);
    }


    public void set(final int i, int j) {
//        i++;
        j = i + 2;
        System.out.println("i = " + i + " ,j = " + j);
    }
}
