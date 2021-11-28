package reusing.proxy;

/**
 * @author hucc
 * 2021/11/28 20:34
 */
public class ExpensiveObjectImpl implements ExpensiveObject {

    ExpensiveObjectImpl() {
        initConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing...");
    }

    private void initConfiguration() {
        System.out.println("Loading configuration...");
    }

}
