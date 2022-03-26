package initialization;

/**
 * @author hucc
 * 2021/11/26 21:21
 */
public class KeywordThis {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}

class Leaf {
    int i = 0;

    Leaf increment() {
        ++i;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }
}
