package abstractFactory;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 11:38
 */
public class AndroidOperationController implements OperationController{
    @Override
    public void operation() {
        System.out.println("Android");
    }
}
