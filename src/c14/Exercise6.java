package c14;

/**
 * Created by SuSong on 2015-02-01 17:00.
 */

import java.lang.reflect.Method;
import java.util.*;

class Shape {

    boolean highlight = false;

    public void highlight() {
        highlight = true;
    }

    public void clearHighlight() {
        highlight = false;
    }

    void draw() {
        System.out.println(this.toString() + " draw()");
    }

    public String toString() {
        return getClass().getName() + (highlight ? " highlight" : " normal");
    }

    static List<Shape> shapes = new ArrayList<>();

    public Shape() {
        shapes.add(this);
    }

    static void highlight1(Class<?> type) {
        for (Shape shape : shapes) {
            if (type.isInstance(shape)) {
                shape.highlight();
            }
        }
    }

    static void clearHighlight1(Class<?> type) {
        for (Shape shape : shapes) {
            if (type.isInstance(shape)) {
                shape.clearHighlight();
            }
        }
    }

    static void forEach(Class<?> type, String method) {
        try {
            Method m = Shape.class.getMethod(method, null);
            for (Shape shape : shapes) {
                if (type.isInstance(shape)) {
                    m.invoke(shape, null);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void highlight2(Class<?> type) {
        forEach(type, "highlight");
    }

    static void clearHighlight2(Class<?> type) {
        forEach(type, "clearHighlight");
    }
}

class Circle extends Shape {

}

class Square extends Shape {

}

class Triangle extends Shape {

}

public class Exercise6 {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(),
                new Triangle(), new Square(),
                new Triangle(), new Circle(),
                new Circle(), new Square());
        Shape.highlight1(Circle.class);
        Shape.highlight2(Circle.class);
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("***********");
        Shape.highlight1(Shape.class);
        Shape.highlight2(Shape.class);
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("***********");

        Shape.clearHighlight1(ArrayList.class);
        Shape.clearHighlight2(ArrayList.class);
        for(Shape shape:shapes){
            shape.draw();
        }

        Shape.clearHighlight1(Circle.class);
        for(Shape shape:shapes){
            shape.draw();
        }
    }
}
