package simplefactory;

import simplefactory.Shape;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 10:52
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");
    }
}
