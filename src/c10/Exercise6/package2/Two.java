package c10.Exercise6.package2;

import c10.Exercise6.package1.One;

/**
 * Created by SuSong on 2015-01-04 21:38.
 */
public class Two {
    protected class TwoInner implements One {

        public TwoInner() {
        }

        @Override
        public void atOne() {
            System.out.println("One.atOne()");
        }
    } 
}
