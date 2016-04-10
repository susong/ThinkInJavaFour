package c6;

import c7.Exercise15;

/**
 * Created by SuSong on 2014/12/21 0021.
 */
public class Exercise15_Test3 extends Exercise15{
    public static void main(String[] args) {
        Exercise15_Test3 exercise15Test3 = new Exercise15_Test3();
        exercise15Test3.protectedTest("test3");
        exercise15Test3.publicTest("test3");

        Exercise15 exercise15 = new Exercise15();
        exercise15.publicTest("test3");
    }
}
