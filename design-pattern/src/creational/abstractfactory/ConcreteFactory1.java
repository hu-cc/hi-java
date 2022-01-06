package creational.abstractfactory;

/**
 * @author hucc
 * 2022/1/6 6:10
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB1();
    }

}
