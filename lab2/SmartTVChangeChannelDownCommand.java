package lab2;

public class SmartTVChangeChannelDownCommand implements Command {
    private SmartTV smartTV;

    public SmartTVChangeChannelDownCommand(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public void execute() {
        smartTV.changeChannelDown();
    }

    @Override
    public void undo() {
        smartTV.changeChannelUp();
    }
}
