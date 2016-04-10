package c11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by SuSong on 2015-01-11 23:39.
 */
public class Exercise14 {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        ListIterator<Integer> iterator = integers.listIterator();
        for (int i = 0; i < 10; i++) {
            iterator.add(i);
            System.out.println("iterator.nextIndex() " + iterator.nextIndex());
            System.out.println("iterator.previousIndex() " + iterator.previousIndex());
            if (i % 2 == 0) {
                System.out.println("--------------");
                iterator.previous();
            }
        }
        System.out.println(integers);
    }
}
