package prototype;

import java.io.*;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 14:20
 */
public class Customer implements Serializable,Cloneable {
    private static final long serialVersionUID = -8836367807392087516L;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    //浅拷贝
    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer)super.clone();
    }
    //深拷贝
    protected Customer deepClone() throws IOException, ClassNotFoundException {
        //序列化输出
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        //反序列化
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Customer) objectInputStream.readObject();
    }
}
