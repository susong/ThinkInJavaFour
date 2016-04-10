package c5;

/**
 * Created by SuSong on 2014/12/11 0011.
 */
public class Exercise10 {


    public static void main(String[] args) {
        new Exercise10();
        System.gc();
//        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
        super.finalize();
    }
}
