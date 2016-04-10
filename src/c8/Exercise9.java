package c8;

/**
 * Created by SuSong on 2014/12/27 0027.
 */

interface Rodent {

    public void eat();

}

class Mouse implements Rodent {
    public void eat() {
        System.out.println("Mouse.eat()");
    }
}

class Gerbil implements Rodent {
    public void eat() {
        System.out.println("Gerbil.eat()");
    }
}

class Hamster implements Rodent {
    public void eat() {
        System.out.println("Hamster.eat()");
    }
}


public class Exercise9 {


    public static void main(String[] args) {

        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };


        for(int i=0;i<rodents.length;i++){
            rodents[i].eat();
        }
    }
}
