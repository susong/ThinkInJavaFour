package c10;

/**
 * Created by SuSong on 2015-01-07 22:05.
 */

interface U {
    void a();

    void b();

    void c();
}

class A {
    U getU(final String s) {
        return new U() {
            @Override
            public void a() {
                System.out.println("a " + s);
            }

            @Override
            public void b() {
                System.out.println("b " + s);
            }

            @Override
            public void c() {
                System.out.println("c " + s);
            }
        };
    }
}

class B {
    U[] us = new U[3];

    void setUs(U u) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                us[i] = u;
                break;
            }
        }
    }

    void clearUs() {
        for (int i = 0; i < us.length; i++) {
            us[i] = null;
        }
    }

    void sequenceUs() {
        for (int i = 0; i < us.length; i++) {

            if (us[i] == null) {
                System.out.println("su[" + i + "] = null");
                continue;
            }

            U u = us[i];
            u.a();
            u.b();
            u.c();
        }
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.setUs(a1.getU("1"));
        b.setUs(a2.getU("2"));
        b.setUs(a3.getU("3"));
        b.sequenceUs();
        b.clearUs();
        System.out.println("clear----------------");
        b.sequenceUs();

    }
}
