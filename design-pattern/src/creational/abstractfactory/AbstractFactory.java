package creational.abstractfactory;

/**
 * @author hucc
 * 2022/1/6 6:04
 */
public interface AbstractFactory {
    AbstractProductA CreateProductA();
    AbstractProductB CreateProductB();
}
