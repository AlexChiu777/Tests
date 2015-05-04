package designpattern.decorator.unchanged;

/**
 * Created by Alex on 5/3/2015.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
