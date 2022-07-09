package creational.factorymethod;

/**
 * @author hucc
 * 2022/7/9 22:04
 */
public class Client {

    public static void main(String[] args) {
        Product product = new CreatorA().createProduct();
        product.doStuff();
        product = new CreatorB().createProduct();
        product.doStuff();
    }

}
