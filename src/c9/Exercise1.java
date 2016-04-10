package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */
abstract class  Rodent {

    public abstract void eat();

}

class Mouse extends Rodent {
    public void eat() {
        System.out.println("Mouse.eat()");
    }
}

class Gerbil extends Rodent {
    public void eat() {
        System.out.println("Gerbil.eat()");
    }
}

class Hamster extends Rodent {
    public void eat() {
        System.out.println("Hamster.eat()");
    }
}


public class Exercise1 {


    public static void main(String[] args) {

        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };


        for (int i = 0; i < rodents.length; i++) {
            rodents[i].eat();
        }

    }
}