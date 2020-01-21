package factorymethod;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:17
 */
public class PngFactory implements ReadFactory{
    @Override
    public PicReadTool createTool() {
        PicReadTool pngTool = new PngTool();
        //初始化工作
        return pngTool;
    }
}
