package reusing.combination;

/**
 * @author hucc
 * 2021/11/28 20:22
 */
class Foo {
    private String name;

    Foo() {
        System.out.println("Foo()");
        name = "Foo constructor";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bar {
    private Foo foo = new Foo();

    @Override
    public String toString() {
        return "Bar:" + "{ foo=" + foo + " }";
    }
}

public class Demo {
    public static void main(String[] args) {
        Bar bar = new Bar();
        System.out.println(bar);
    }
}
