package factorymethod;

import factorymethod.PicReadTool;
import factorymethod.ReadFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:12
 */
public class GifFactory implements ReadFactory {

    @Override
    public PicReadTool createTool() {
        //初始化工作
        PicReadTool gitTool = new GifTool();
        //工具的一些配置
        return gitTool;
    }
}
