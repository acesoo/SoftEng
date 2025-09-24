package lab2;

public class MusicPlayer {
    private boolean isPlaying;
    private int volume;
    private String currentPlaylist;

    public MusicPlayer() {
        this.isPlaying = false;
        this.volume = 50; 
        this.currentPlaylist = "Default Playlist";
    }

    public void play() {
        isPlaying = true;
        System.out.println("Music Player is playing " + currentPlaylist + " at volume " + volume);
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music Player is stopped");
    }

    public void increaseVolume() {
        if (isPlaying && volume < 100) {
            volume += 10;
            System.out.println("Music Player volume increased to " + volume);
        }
    }

    public void decreaseVolume() {
        if (isPlaying && volume > 0) {
            volume -= 10;
            System.out.println("Music Player volume decreased to " + volume);
        }
    }
}
