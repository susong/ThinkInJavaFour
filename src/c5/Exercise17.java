package c5;

/**
 * Created by SuSong on 2014/12/14 0014.
 */
public class Exercise17 {

    public static void main(String[] args) {
        Test[] tests = new Test[5];

        for(int i=0;i<tests.length;i++){
            tests[i] = new Test(i+"");
        }
    }


}

class Test{
    Test(String str){
        System.out.println("str:"+str);
    }
}