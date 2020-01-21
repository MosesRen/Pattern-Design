package simplefactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 10:53
 */
public class ShapeFactory {
    private static Exception UnSupportedShapeException = new Exception();

    public static Shape getShape(String type) throws Exception {
        if ("Round".equals(type)) {
            return new Round();
        }
        if ("Square".equals(type)) {
            return new Square();
        }
        if ("Triangle".equals(type)) {
            return new Triangle();
        }
        throw UnSupportedShapeException;
    }
}
