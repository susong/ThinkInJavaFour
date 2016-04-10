package c7;

/**
 * Created by SuSong on 2014/12/22 0022.
 */

class WithBlankFinalField{
    private final  Integer i;
    public WithBlankFinalField(Integer i) {
        this.i = i;
//        this.i = 2;
    }

    public Integer getI() {
        if(i==null){
//            i = new Integer(45);
        }
        return i;
    }
}

public class Exercise19 {
    public static void main(String[] args) {
        WithBlankFinalField withBlankFinalField = new WithBlankFinalField(2);
        Integer i = withBlankFinalField.getI();
        System.out.println(i);
    }
}
