package c11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by SuSong on 2015-01-11 23:06.
 */
public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        for (Integer anInt : ints) {
            System.out.print(anInt + ", ");
        }

        System.out.println();
        List<Integer> ints2 = new ArrayList<>(10);
        ListIterator<Integer> listIterator = ints.listIterator(ints.size());
        while (listIterator.hasPrevious()) {
            ints2.add(listIterator.previous());
        }

        for (Integer integer : ints2) {
            System.out.print(integer + ", ");
        }
    }
}
