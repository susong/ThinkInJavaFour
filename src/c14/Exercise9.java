package c14;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SuSong on 2015-02-01 22:34.
 */

interface Iface {
    int i = 47;

    void f();
}

class Base implements Iface {
    String s;
    double d;

    public void f() {
        System.out.println("Base.f");
    }
}

class Composed {
    Base b;
}

class Derived extends Base {
    Composed c;
    String s;
}

public class Exercise9 {

    static Set<Class<?>> alreadyDisplayed = new HashSet<>();

    static void printClasses(Class<?> c) {
        if (c == null) {
            return;
        }
        System.out.println("=== getName : "+c.getName());
        Field[] fields = c.getDeclaredFields();
        if (fields.length != 0) {
            System.out.println("Fileds:");
            for (Field f : fields) {
                System.out.println("    " + f);
            }
            for (Field f : fields) {
                Class<?> k = f.getType();
                if (!alreadyDisplayed.contains(k)) {
                    printClasses(k);
                    alreadyDisplayed.add(k);
                }
            }
            for (Class<?> k : c.getInterfaces()) {
                System.out.println("Interface : " + k.getName());
                printClasses(k.getSuperclass());
            }

            printClasses(c.getSuperclass());
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1) {
                System.out.println("=====================");
            }
        }
    }
}
