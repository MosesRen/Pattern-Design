package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:30
 */
public interface AbstractFactory {
    OperationController createOptionController();
    InterfaceController createInterfaceController();
}
