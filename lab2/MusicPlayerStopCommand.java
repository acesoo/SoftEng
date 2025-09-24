package lab2;

public class MusicPlayerStopCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerStopCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }

    @Override
    public void undo() {
        musicPlayer.play();
    }
}
