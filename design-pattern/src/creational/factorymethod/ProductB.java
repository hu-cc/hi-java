package creational.factorymethod;

/**
 * @author hucc
 * 2022/7/9 22:02
 */
public class ProductB extends Product {

    ProductB() {
        name = "ProductB";
    }

    @Override
    void doStuff() {
        System.out.println(name + " doStuff()");
    }
}
