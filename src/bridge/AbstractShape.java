package bridge;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/21 11:01
 */
public abstract class AbstractShape {
    protected DrawAPI drawAPI;

    public AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     * 抽象方法
     */
    abstract void draw();
}
