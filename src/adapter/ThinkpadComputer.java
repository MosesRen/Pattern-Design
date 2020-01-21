package adapter;

/**
 * @description: 计算机示例
 * @author: jehuRen
 * @date: Created in 2020/1/21 10:24
 */
public class ThinkpadComputer implements Computer {
    @Override
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
