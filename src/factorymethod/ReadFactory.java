package factorymethod;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:09
 */
public interface ReadFactory {
    /**
     * 创建一个工具类
     * @return
     */
    PicReadTool createTool();
}
