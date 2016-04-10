package c11;

import java.util.*;

/**
 * Created by SuSong on 2015-01-12 21:54.
 */
public class Exercise16 {
    private final static Set<Character> CHARACTERS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        ArrayList<String> text = new TextFile("src/com/susong/thinkinjavafour/chapter11/Exercise15.java", "\\W+");
        System.out.println(text);
        int total = 0;
        for (int i = 0; i < text.size(); i++) {
            int cTotal = 0;
            for (Character c : text.get(i).toCharArray()) {
                if (CHARACTERS.contains(c)) {
                    cTotal++;
                }
            }
            if(!set.contains(text.get(i))){
                set.add(text.get(i));
                System.out.println(text.get(i) + "  " + cTotal);
            }
            total += cTotal;
        }
        System.out.println("total : " + total);

    }
}
