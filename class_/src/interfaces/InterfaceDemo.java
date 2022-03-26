package interfaces;

/**
 * @author hucc
 * 2021/12/1 20:51
 */
interface Music {
    String name = "music";

    void play();
}

class Pop implements Music {
    public void popularTime() {
        System.out.println("2021");
    }

    @Override
    public void play() {
        System.out.println("Play Pop " + Music.name + ".");
    }
}

class Rock implements Music {
    @Override
    public void play() {
        System.out.println("Play Rock " + Music.name + ".");
    }
}

class RhythmAndBlues extends Rock {
    @Override
    public String toString() {
        return "RhythmAndBlues";
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Music popMusic = new Pop();
        popMusic.play();
        Pop pop = new Pop();
        pop.popularTime();
        System.out.println("----------------");
        Music rockMusic = new Rock();
        rockMusic.play();
        System.out.println("----------------");
        Music rhythmAndBlues = new RhythmAndBlues();
        rhythmAndBlues.play();
        System.out.println(rhythmAndBlues);
    }
}
