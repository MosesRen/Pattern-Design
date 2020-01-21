package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:50
 */
public class AndroidFactory implements AbstractFactory{

    @Override
    public OperationController createOptionController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
