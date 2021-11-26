package initialization;

/**
 * @author hucc
 * 2021/11/26 21:10
 */
public class SimpleConstructor {

    public static void main(String[] args) {
        Rock rock = new Rock();
//        Rock2 rock2 = new Rock2() // error
        Rock2 rock2 = new Rock2(0);
        Rock3 rock3 = new Rock3();
        rock3 = new Rock3(0);
    }

}

class Rock {

}

class Rock2 {

    Rock2(int i) {
        System.out.println("Rock2 " + i + " ");
    }

}

class Rock3 {

    Rock3() {

    }

    Rock3(int i) {
        System.out.println("Rock3 " + i + " ");
    }

}
