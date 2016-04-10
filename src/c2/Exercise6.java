package c2;

/**
 * Created by SuSong on 2014/11/30 0030.
 */
public class Exercise6 {

    String s = "Hello";

    int storage(String s){
        return s.length()*2;
    }

    void print(){
        System.out.println("storage(s):"+storage(s));
    }

    public static void main(String[] args) {
        new Exercise6().print();
    }
}
