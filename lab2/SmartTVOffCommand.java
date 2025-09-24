package lab2;

public class SmartTVOffCommand implements Command {
    private SmartTV smartTV;

    public SmartTVOffCommand(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public void execute() {
        smartTV.turnOff();
    }

    @Override
    public void undo() {
        smartTV.turnOn();
    }
}
