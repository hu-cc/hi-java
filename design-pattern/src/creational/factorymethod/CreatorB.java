package creational.factorymethod;

/**
 * @author hucc
 * 2022/7/9 22:03
 */
public class CreatorB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }

}
