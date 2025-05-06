package P;

// Playable interface
interface Playable {
    void play();
    void pause();
    void stop();
}

// MusicPlayer class implementing Playable interface
class MusicPlayer implements Playable {
    // Implementing play method
    public void play() {
        System.out.println(" Music is playing.");
    }

    // Implementing pause method
    public void pause() {
        System.out.println(" Music is paused.");
    }

    // Implementing stop method
    public void stop() {
        System.out.println(" Music is stopped.");
    }
}

// Main class to test the Playable interface
public class TestPlayer {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.play();  // Start music
        player.pause(); // Pause music
        player.stop();  // Stop music
    }
}
