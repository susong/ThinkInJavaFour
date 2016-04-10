package c10;

/**
 * Created by SuSong on 2015-01-04 23:33.
 */

class QQ {
    private class TT implements Destination {
        @Override
        public String readLabel() {
            System.out.println("readLabel");
            return "readLabel";
        }
    }

    public Destination getTT() {
        return new TT();
    }

    public TT getT() {
        return new TT();
    }
}


public class Exercise11 {


    public static void main(String[] args) {
        QQ qq = new QQ();
        Destination tt = qq.getTT();
        tt.readLabel();
        Destination t = qq.getT();
//        TT t = (TT)tt;
    }
}
