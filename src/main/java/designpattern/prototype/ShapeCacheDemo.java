package designpattern.prototype;

/**
 * Created by Alex on 5/4/2015.
 */
public class ShapeCacheDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Circle circle = (Circle) ShapeCache.getShape(1);
        Square square = (Square) ShapeCache.getShape(2);

        circle.draw();

        square.draw();
    }
}
