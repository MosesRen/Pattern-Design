package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:49
 */
public class WindowsFactory implements AbstractFactory{
    @Override
    public OperationController createOptionController() {
        return new WindowsOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }
}
