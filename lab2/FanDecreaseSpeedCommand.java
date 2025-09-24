package lab2;

public class FanDecreaseSpeedCommand implements Command {
    private Fan fan;

    public FanDecreaseSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.decreaseSpeed();
    }

    @Override
    public void undo() {
        fan.increaseSpeed();
    }
}
