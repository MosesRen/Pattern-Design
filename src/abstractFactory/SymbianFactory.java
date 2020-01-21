package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:46
 */
public class SymbianFactory implements AbstractFactory {
    @Override
    public OperationController createOptionController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
