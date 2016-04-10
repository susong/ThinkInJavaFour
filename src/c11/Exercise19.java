package c11;

import java.util.*;

/**
 * Created by SuSong on 2015-01-15 21:20.
 */
public class Exercise19 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(new Random().nextInt(100) + "");
        }

        System.out.println(set);
        String[] strs = set.toArray(new String[0]);
        Arrays.sort(strs);


        Set<String> set2 = new LinkedHashSet<>();
        for (String s : strs) {
           set2.add(s);
        }
        System.out.println(set2);
    }
}
