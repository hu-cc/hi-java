/**
 * @author hucc
 * 2022/4/17 15:46
 */
public class GenericHolder<T> {
    private T a;

    public GenericHolder() {}

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> h = new GenericHolder<>();
        h.set(new Automobile());
        Automobile a = h.get();
    }
}

class Automobile {}
