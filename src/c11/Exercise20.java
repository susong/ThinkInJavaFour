package c11;

import java.util.*;

/**
 * Created by SuSong on 2015-01-15 21:31.
 */
public class Exercise20 {

    private final static Set<Character> CHARACTERS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        Map<Character, Integer> word = new HashMap<>();
        Map<Character, Integer> file = new HashMap<>();
        Set<String> process = new HashSet<>();
        ArrayList<String> text = new TextFile("src/com/susong/thinkinjavafour/chapter11/Exercise15.java", "\\W+");
        System.out.println(text);

        for (int i = 0; i < text.size(); i++) {
            word.clear();
            for (Character c : text.get(i).toCharArray()) {
                if (CHARACTERS.contains(c)) {
                    Character ch = Character.toLowerCase(c);
                    Integer integer = word.get(ch);
                    int num = integer == null ? 1 : integer + 1;
                    word.put(ch, num);

                    Integer integer1 = file.get(ch);
                    int num1 = integer1 == null ? 1 : integer1 + 1;
                    file.put(ch, num1);
                }
            }
            if (!process.contains(text.get(i))) {
                process.add(text.get(i));
                System.out.println(text.get(i) + "  " + word);
            }
        }
        System.out.println("total : "+file);
    }
}
