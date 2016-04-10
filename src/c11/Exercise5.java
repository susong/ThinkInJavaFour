package c11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SuSong on 2015-01-11 20:46.
 */
public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("1: " + ints);
        ints.add(8);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(8));
        ints.remove(Integer.valueOf(8));
        Integer i = ints.get(2);
        System.out.println("4: " + i + " " + ints.indexOf(i));
        Integer j = Integer.valueOf(1);
        System.out.println("5: " + ints.indexOf(j));
        System.out.println("6: " + ints.remove(j));
        System.out.println("7: " + ints.remove(i));
        System.out.println("8: " + ints);
        ints.add(3, 9);
        System.out.println("9: " + ints);
        List<Integer> sub = ints.subList(1, 4);
        System.out.println("10: " + sub);
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + ints.containsAll(sub));
        Collections.shuffle(sub);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(ints);
        sub = Arrays.asList(ints.get(1), ints.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13:" + copy);

    }
}
