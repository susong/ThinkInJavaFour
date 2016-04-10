package c7;

/**
 * Created by SuSong on 2014/12/21 0021.
 */
public class Exercise15 {


    public void publicTest(String str) {
        System.out.println("publicTest:" + str);
    }

    protected void protectedTest(String str) {
        System.out.println("protectedTest:" + str);
    }

    void friendlyTest(String str) {
        System.out.println("friendlyTest:" + str);
    }

    private void privateTest(String str) {
        System.out.println("privateTest:" + str);
    }

    public static void main(String[] args) {
        Exercise15 exercise15 = new Exercise15();
        exercise15.privateTest("exercise15");
    }
}
