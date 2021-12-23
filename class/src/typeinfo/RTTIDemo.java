package typeinfo;

/**
 * @author hucc
 * 2021/12/23 22:51
 */
class Toy {
    public static int value = 16;

    static {
        System.out.println("Initializing Toy");
    }
}

public class RTTIDemo {

    // 多态和反射的使用都利用了RTTI这一思想

    public static void main(String[] args) throws ClassNotFoundException {
        Object obj = new String("Hello, world!");
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());

        Class clazz = Class.forName("typeinfo.Toy");

        Class toy = Toy.class;
        System.out.println("After creating Toy ref");
        System.out.println(Toy.value);
    }
}
