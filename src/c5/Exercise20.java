package c5;

/**
 * Created by SuSong on 2014/12/14 0014.
 */
public class Exercise20 {
    public static void main(String[] args) {
        TestString testString = new TestString();
        testString.Str("aaa","bbb");
        testString.Str(new String[]{"aaa","bbb"});
    }
}


class TestString {
    void Str(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings:" + strings[i]);
        }
    }
}