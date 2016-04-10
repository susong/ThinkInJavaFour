package c9;

/**
 * Created by SuSong on 2014/12/28 0028.
 */

abstract class Animal {

    public Animal() {
        print();
    }

    abstract void print();
}

class Dog extends Animal {

    int age = 1;

    @Override
    void print() {
        System.out.println("age = " + age);
    }
}


public class Exercise3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
    }
}
