package reusing.proxy;

/**
 * @author hucc
 * 2021/11/28 20:36
 */
public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        System.out.println("Proxy process start");
        if (object == null)  {
            object = new ExpensiveObjectImpl();
        }
        object.process();
        System.out.println("Proxy process end");
    }
}
