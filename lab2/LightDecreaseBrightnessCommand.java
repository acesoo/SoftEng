package lab2;

public class LightDecreaseBrightnessCommand implements Command {
    private Light light;

    public LightDecreaseBrightnessCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.decreaseBrightness();
    }

    @Override
    public void undo() {
        light.increaseBrightness();
    }
}
