package simplefactory;

import simplefactory.Shape;

/**
 * @description: 产品具体实现类
 * @author: jehuRen
 * @date: Created in 2020/1/20 10:50
 */
public class Round implements Shape {
    @Override
    public void draw() {
        System.out.println("this is round");
    }

    @Override
    public void erase() {
        System.out.println("erase round");
    }
}
