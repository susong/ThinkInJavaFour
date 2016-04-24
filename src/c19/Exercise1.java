package c19;

import static c19.Signal.*;
import static net.mindview.util.Print.print;

/**
 * Created by susong on 16/4/24.
 */
public class Exercise1 {
    Signal color = RED;

    public void change() {
        switch (color) {
            // Note that you don't have to say Signal.RED
            // in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        Exercise1 t = new Exercise1();
        for (int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }
}


enum Signal {GREEN, YELLOW, RED,}