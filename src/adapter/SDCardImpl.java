package adapter;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/21 10:23
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
