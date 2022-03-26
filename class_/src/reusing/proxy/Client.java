package reusing.proxy;

/**
 * @author hucc
 * 2021/11/28 20:37
 */
public class Client {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
