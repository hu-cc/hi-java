package creational.abstractfactory;

/**
 * @author hucc
 * 2022/1/6 6:12
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB2();
    }
}
