package designpattern.prototype;

/**
 * Created by Alex on 5/4/2015.
 */
public class Square extends Shape {
    public Square () {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
