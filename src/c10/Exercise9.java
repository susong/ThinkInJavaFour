package c10;

/**
 * Created by SuSong on 2015-01-04 23:23.
 */

interface E9Inter {
    void add();
}


public class Exercise9 {

    public E9Inter getE9Inter() {

        if(true){

            class E9Imp implements E9Inter {
                @Override
                public void add() {
                    System.out.println("E9Inter.add()");
                }
            }
            return new E9Imp();
        }else{
            return null;
        }


    }


    public static void main(String[] args) {
        new Exercise9().getE9Inter().add();
    }
}
