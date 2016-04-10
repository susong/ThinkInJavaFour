package c5;

/**
 * Created by SuSong on 2014/12/14 0014.
 */
public class Exercise21 {
    public static void main(String[] args) {

        Spiciness spiciness = Spiciness.FLAMING;

        System.out.println(spiciness);

        for (Spiciness s : Spiciness.values()) {
            System.out.println("s:" + s + " name:" + s.name() + " ordinal:" + s.ordinal());
        }


        Burrito
                plain = new Burrito(Spiciness.FLAMING),
                green = new Burrito(Spiciness.MEDIUM),
                jala = new Burrito(Spiciness.NOT);
        plain.describe();
        green.describe();
        jala.describe();
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class Burrito {
    Spiciness degree;

    Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.println("This burrito is");
        switch (degree) {
            case NOT:
                System.out.println("not");
                break;
            case MILD:
                System.out.println("mild");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            case HOT:
                System.out.println("hot");
                break;
            case FLAMING:
                System.out.println("flaming");
                break;
        }
    }
}