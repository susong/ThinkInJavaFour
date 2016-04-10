package c11;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Created by SuSong on 2015-01-11 14:51.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Collection<Integer> c= new TreeSet<>();
        for(int i=0;i<10;i++){
            c.add(i);
        }

        c.add(2);

        for(Integer i:c){
            System.out.println(i+ " ,");
        }
    }
}
