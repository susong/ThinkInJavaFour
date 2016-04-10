package c7;

/**
 * Created by SuSong on 2014/12/22 0022.
 */

class AA {
    public BB bb;

    public AA(BB bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "AA{" +
                "bb=" + bb +
                '}';
    }
}

class BB {
    @Override
    public String toString() {
        return "BB{}";
    }
}

class CC extends BB {
    @Override
    public String toString() {
        return "CC{}";
    }
}

class DD extends BB {
    @Override
    public String toString() {
        return "DD{}";
    }
}

class EE extends AA {
    public EE(BB bb) {
        super(bb);
    }

    @Override
    public String toString() {
        return "EE{}";
    }
}

public class FinalTest {

    private final AA aa = new AA(new BB());

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
//        finalTest.aa = new AA(new BB());
//        finalTest.aa = new EE(new BB());
        finalTest.aa.bb = new CC();
        System.out.println(finalTest.aa.toString());
        System.out.println(finalTest.aa.bb.toString());
        finalTest.aa.bb = new DD();
        System.out.println(finalTest.aa.toString());
        System.out.println(finalTest.aa.bb.toString());
    }
}

