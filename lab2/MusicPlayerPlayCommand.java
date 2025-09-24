package lab2;

public class MusicPlayerPlayCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerPlayCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }

    @Override
    public void undo() {
        musicPlayer.stop();
    }
}
