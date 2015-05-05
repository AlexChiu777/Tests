package designpattern.prototype;

/**
 * Created by Alex on 5/4/2015.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
