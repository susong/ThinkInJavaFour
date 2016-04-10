package c14;

/**
 * Created by SuSong on 2015-02-01 18:09.
 */
public class Exercise8 {

    static void printClasses(Class<?> c) {
        if (c == null) {
            return;
        }
        System.out.println(c.getName());

        for (Class in : c.getInterfaces()) {
            System.out.println("Interface: " + in.getName());
            printClasses(in);
        }


        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1) {
                System.out.println("==============");
            }
        }
    }
}
