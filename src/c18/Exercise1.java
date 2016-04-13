package c18;


import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by susong on 16/4/12.
 */
public class Exercise1 {
    public static void main(final String[] args) {
        File path = new File(".");
//        File path = new File("/Users/susong/Developer/Work/");
        String[] list = path.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                System.out.println(file.getAbsolutePath());
                if (file.isFile()) {
                    String str = TextFile.read(file.getAbsolutePath());
                    if (str.contains("ThinkInJavaFour")) {
                        return true;
                    }
                }
                return false;
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}
