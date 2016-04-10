package c10;

/**
 * Created by SuSong on 2015-01-06 23:54.
 */
interface E13Inter{
    void add();
}


public class Exercise13 {
    public E13Inter getE13Inter(){
        if(true){
            return new E13Inter() {
                @Override
                public void add() {
                    System.out.println("E13Inter.add()");
                }
            };
        }else {
            return null;
        }


    }

    public static void main(String[] args) {
        new Exercise13().getE13Inter().add();
    }
}
