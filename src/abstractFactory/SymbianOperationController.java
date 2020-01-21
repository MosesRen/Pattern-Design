package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:43
 */
public class SymbianOperationController implements OperationController{
    @Override
    public void operation() {
        System.out.println("Symbian");
    }
}
