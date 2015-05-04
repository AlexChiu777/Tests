package designpattern.decorator;

import designpattern.decorator.unchanged.Shape;

/**
 * Created by Alex on 5/3/2015.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
