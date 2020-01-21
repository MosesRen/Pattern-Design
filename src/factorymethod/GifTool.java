package factorymethod;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:15
 */
public class GifTool implements PicReadTool {
    @Override
    public void read() {
        System.out.println("read gif");
    }
}
