package reusing.inherit;

/**
 * @author hucc
 * 2021/11/27 21:59
 */
class Art {
    String type = "Art";

    Art() {
        System.out.println("Art no args constructor");
    }

    Art(String name) {
        System.out.println("Art constructor - " + name);
    }

    void cost(int hours) {
        System.out.println("Cost " + hours + "hrs");
    }
}

class Drawing extends Art {
    String type = "Drawing";

    Drawing() {
        System.out.println("Drawing no args constructor");
    }

    Drawing(String name) {
        super(name);
        System.out.println("Drawing constructor");
    }
    void colour(String rgb) {
        System.out.print("Colour: " + rgb);
    }
    void showTypes() {
        String type = "Method of Drawing";
        System.out.println(super.type);
        System.out.println(this.type);
        System.out.println(type);
    }
}

public class Demo extends Drawing {
    Demo() {
        System.out.println("Demo no args constructor");
    }

    public Demo(String name) {
       super(name);
       System.out.println("Demo constructor");
    }

    @Override
    void colour(String rgb) {
        super.colour(rgb);
        System.out.println(" and colour: #0000FF");
    }

    public static void main(String[] args) {
        Demo demo = new Demo("Tom");
        demo.cost(1);
        demo.colour("#000000");
        demo.showTypes();
        new Demo();
    }
}
