package c18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by susong on 16/4/12.
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(new SortedDirList().list("^\\w+\\.md$")));
    }
}

class SortedDirList {

    private File path;

    public SortedDirList() {
        this.path = new File(".");
    }

    public SortedDirList(String path) {
        this.path = new File(path);
    }

    public String[] list() {
        String[] list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public String[] list(final String regex) {
        String[] list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }
}
