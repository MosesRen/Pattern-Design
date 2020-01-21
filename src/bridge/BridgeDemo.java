package bridge;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/21 11:09
 */
public class BridgeDemo {
    public static void main(String[] args) {
        ShapeImplement shapeImplement = new ShapeImplement(new RedCircle());
        shapeImplement.draw();
    }
}
