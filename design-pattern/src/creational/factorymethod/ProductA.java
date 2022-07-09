package creational.factorymethod;

/**
 * @author hucc
 * 2022/7/9 22:01
 */
public class ProductA extends Product{

    ProductA() {
        name = "ProductA";
    }

    @Override
    void doStuff() {
        System.out.println(name + " doStuff();");
    }
}
