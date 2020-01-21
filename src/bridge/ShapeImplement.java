package bridge;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/21 11:08
 */
public class ShapeImplement extends AbstractShape {
    public ShapeImplement(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    void draw() {
        drawAPI.drawCircle();
    }
}
