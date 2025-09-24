package lab2;

public class FanIncreaseSpeedCommand implements Command {
    private Fan fan;

    public FanIncreaseSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.increaseSpeed();
    }

    @Override
    public void undo() {
        fan.decreaseSpeed();
    }
}
