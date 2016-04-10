package c11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SuSong on 2015-01-11 21:56.
 */

class Exe7{
    int i;

    public Exe7(int i) {
        this.i = i;
    }


    @Override
    public String toString() {
        return "Exe7{" +
                "i=" + i +
                '}';
    }
}


public class Exercise7 {
    public static void main(String[] args) {

        Exe7[] exe7s1 = new Exe7[10];
        for(int i=0;i<10;i++){
            exe7s1[i] = new Exe7(i);
        }

        List<Exe7> exe7s = new ArrayList<>(Arrays.asList(exe7s1));
        System.out.println(exe7s);

        List<Exe7> sub = exe7s.subList(2, 5);
        System.out.println(sub);

//        exe7s.removeAll(sub);
        sub.clear();
        System.out.println(exe7s);
    }
}
