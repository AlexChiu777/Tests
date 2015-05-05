package designpattern.prototype;

import java.util.HashMap;

/**
 * Created by Alex on 5/4/2015.
 */
public class ShapeCache {
    public static HashMap<Integer, Shape> shapeCache = new HashMap<Integer, Shape>();

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeCache.put(1, circle);

        Square square = new Square();
        square.setId(2);
        shapeCache.put(2, square);
    }


    public static Shape getShape(int shapeId) {
        return (Shape) shapeCache.get(shapeId).clone();
    }
}
