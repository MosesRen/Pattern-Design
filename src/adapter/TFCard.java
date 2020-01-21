package adapter;

/**
 * @description: tf卡接口
 * @author: jehuRen
 * @date: Created in 2020/1/21 10:25
 */
public interface TFCard {
    String readTF();
    int writeTF(String msg);
}
