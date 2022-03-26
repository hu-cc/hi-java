package interfaces;

/**
 * @author hucc
 * 2021/11/30 20:06
 */
abstract class Instrument {

    public String what() {
        return "Instrument";
    }

    abstract void play();
}

class Piano extends Instrument {

    @Override
    void play() {
        System.out.println("Play piano");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Play guitar");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();
        System.out.println(piano.what());
//        new Instrument().what(); // error
        new Guitar().play();
    }
}
