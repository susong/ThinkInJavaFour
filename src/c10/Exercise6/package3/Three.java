package c10.Exercise6.package3;

import c10.Exercise6.package1.One;
import c10.Exercise6.package2.Two;

/**
 * Created by SuSong on 2015-01-04 21:40.
 */
public class Three extends Two {

     One getTwoInner(){
        return new TwoInner();
    }

}
