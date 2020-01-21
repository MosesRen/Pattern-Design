package adapter;

/**
 * @description: SD卡接口
 * @author: jehuRen
 * @date: Created in 2020/1/21 10:23
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    int writeSD(String msg);
}
