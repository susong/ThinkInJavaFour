package c9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by SuSong on 2015/1/1 0001.
 */

class CharSequence {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();

    char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[rand.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[rand.nextInt(vowels.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}

class CharSequenceAdapter extends CharSequence implements Readable{

    private int count;

    public CharSequenceAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count--==0){
            return -1;
        }

        char[] generate = generate();
        cb.put(generate);
        return generate.length;
    }
}


public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharSequenceAdapter(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
