package lab2;

public class SmartTVOnCommand implements Command {
    private SmartTV smartTV;

    public SmartTVOnCommand(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public void execute() {
        smartTV.turnOn();
    }

    @Override
    public void undo() {
        smartTV.turnOff();
    }
}
