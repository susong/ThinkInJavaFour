package c18;

import java.io.File;
import java.util.Arrays;

/**
 * Created by susong on 16/4/13.
 */
public class Exercise3 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        int count = 0;
        int size = 0;
        for (String s : list) {
            File file = new File(path, s);
            if (file.isFile()) {
                count++;
                size += file.length();
                System.out.println(s + " " + file.length() + " byte(s)");
            }
        }
        System.out.println(count + " files(s) " + size + " byte(s)");
    }
}
