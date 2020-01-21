package factorymethod;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:17
 */
public class PngTool implements PicReadTool {
    @Override
    public void read() {
        System.out.println("read png");
    }
}
