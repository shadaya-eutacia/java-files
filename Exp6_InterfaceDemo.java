interface Playable {
    void play();
}

interface Recordable {
    void record();
}

public class Exp6_InterfaceDemo {

    static class MusicPlayer implements Playable, Recordable {
        private String trackName;

        public MusicPlayer(String trackName) {
            this.trackName = trackName;
        }

        @Override
        public void play() {
            System.out.println("Playing track: " + trackName);
        }

        @Override
        public void record() {
            System.out.println("Recording track: " + trackName);
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Favorite Song");

        System.out.println("=== Interface Demo ===");
        player.play();
        player.record();
    }
}