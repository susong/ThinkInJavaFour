package c8;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        this.radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(),radius = " + radius);
    }

}


public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
/*
    Glyph() before draw()
    RoundGlyph.draw(),radius = 0
    Glyph() after draw()
    RoundGlyph.RoundGlyph(),radius = 5
 */