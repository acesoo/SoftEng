package lab2;

public class SmartTVChangeChannelUpCommand implements Command {
    private SmartTV smartTV;

    public SmartTVChangeChannelUpCommand(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public void execute() {
        smartTV.changeChannelUp();
    }

    @Override
    public void undo() {
        smartTV.changeChannelDown();
    }
}
