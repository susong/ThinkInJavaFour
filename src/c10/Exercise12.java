package c10;

/**
 * Created by SuSong on 2015-01-06 22:44.
 */



class Aout {
    private int a;

    private void add() {
        System.out.println("Aout.add()");
    }

    public void query() {
       new Object(){
         void g(){
             add();
             a++;
         }
       }.g();
        System.out.println("a = " + a);
    }
}


public class Exercise12 {
    public static void main(String[] args) {
        Aout aout = new Aout();
        aout.query();
    }
}
