package simplefactory;

import simplefactory.Shape;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 10:51
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Square");
    }

    @Override
    public void erase() {
        System.out.println("erase Square");
    }
}
