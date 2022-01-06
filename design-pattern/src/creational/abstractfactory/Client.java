package creational.abstractfactory;

/**
 * @author hucc
 * 2022/1/6 6:13
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-----------ConcreteFactory1------------");
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.CreateProductA();
        AbstractProductB productB1 = factory1.CreateProductB();
        System.out.println("-----------ConcreteFactory2------------");
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.CreateProductA();
        AbstractProductB productB2 = factory2.CreateProductB();
    }
}
