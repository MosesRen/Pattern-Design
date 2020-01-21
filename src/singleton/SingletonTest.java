package singleton;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 13:59
 */
public class SingletonTest {
    //Initialization on Demand Holder

}
//饿汉式
class Singleton1 {
    private static final Singleton1 instance = new Singleton1();
    private Singleton1() {
    };
    public static Singleton1 getInstance() {
        return instance;
    }
}
class Singleton2 {
    private static Singleton2 instance = null;
    //静态代码块
    static {
        instance = new Singleton2();
    }
    private Singleton2 (){}
    public static Singleton2 getInstance() {
        return instance;
    }
}
//IoDH模式
class Singleton3 {
    private Singleton3() {
    }

    private static class HolderClass {
        private final static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return HolderClass.instance;
    }
}

//懒汉式

class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    };
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
//使用synchronized保证线程安全
class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4() {
    };
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
//改进型(线程安全)
class Singleton5 {
    private static Singleton5 instance;
    private Singleton5() {
    };
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized(Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
//双重判定
class Singleton6 {
    private static Singleton6 instance;
    private Singleton6() {
    };
    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized(Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}