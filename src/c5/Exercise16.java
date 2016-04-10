package c5;

/**
 * Created by SuSong on 2014/12/14 0014.
 */
public class Exercise16 {

    String[] strings = {"one","two"};

    {
        strings = new String[10];
        strings = new String[]{"",""};
    }

    public static void main(String[] args) {

        Exercise16 exercise16 = new Exercise16();

        for(int i=0;i< exercise16.strings.length;i++){
            System.out.println(exercise16.strings[i]);
        }
    }
}
