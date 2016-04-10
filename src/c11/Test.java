package c11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by SuSong on 2015-01-11 17:32.
 */
public class Test {



    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for(int i=0;i<5;i++){
            strings.add(i+"");
        }

        System.out.println(strings);

        List<String> s2 = strings.subList(1, 4);
        System.out.println(s2);

        Collections.shuffle(s2);
        System.out.println(s2);

        System.out.println(strings);

        Collections.shuffle(strings);
        System.out.println(strings);
        System.out.println(s2);
    }
}
