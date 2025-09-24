package lab2;

public class LightIncreaseBrightnessCommand implements Command {
    private Light light;

    public LightIncreaseBrightnessCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseBrightness();
    }

    @Override
    public void undo() {
        light.decreaseBrightness();
    }
}
