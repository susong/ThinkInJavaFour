package c5;

/**
 * Created by SuSong on 2014/12/9 0009.
 */
public class Exercise2 {

    String s = "Hello";
    String s2;

    public Exercise2(String str){
        s2 = str;
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2("world");
        System.out.println(exercise2.s);
        System.out.println(exercise2.s2);
    }
}
