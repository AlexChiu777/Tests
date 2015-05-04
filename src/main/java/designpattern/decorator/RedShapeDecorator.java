package designpattern.decorator;

import designpattern.decorator.unchanged.Shape;

/**
 * Created by Alex on 5/3/2015.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorders(decoratedShape);
    }

    private void setRedBorders(Shape decoratedShape) {
        System.out.println("Border Color Red");
    }
}
