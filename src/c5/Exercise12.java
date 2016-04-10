package c5;

/**
 * Created by SuSong on 2014/12/11 0011.
 */
public class Exercise12 {


    public static void main(String[] args) {

        new Tank().empty();
        new Tank();
        System.gc();

    }
}

class Tank {

    static int counter;

    int id = counter++;


    boolean full = false;

    public Tank() {
        System.out.println("Tank " + id + " create");
        full = true;
    }

    public void empty() {
        full = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (full) {
            System.out.println("error: full is true");
        } else {
            System.out.println("Tank " + id + " cleaned OK");
        }
        super.finalize();
    }
}
