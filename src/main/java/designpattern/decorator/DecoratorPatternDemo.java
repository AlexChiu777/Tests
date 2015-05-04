package designpattern.decorator;

import designpattern.decorator.unchanged.Circle;
import designpattern.decorator.unchanged.Shape;
import designpattern.decorator.unchanged.Square;

/**
 * Created by Alex on 5/3/2015.
 */

/*
* Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
* This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
* */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redSquare = new RedShapeDecorator(new Square());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nSquare of red border");
        redSquare.draw();
    }
}
