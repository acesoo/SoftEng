package lab2;

public class Light {
    private boolean isOn;
    private int brightness;

    public Light() {
        this.isOn = false;
        this.brightness = 50; 
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON with brightness " + brightness);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }

    public void increaseBrightness() {
        if (isOn && brightness < 100) {
            brightness += 10;
            System.out.println("Light brightness increased to " + brightness);
        }
    }

    public void decreaseBrightness() {
        if (isOn && brightness > 0) {
            brightness -= 10;
            System.out.println("Light brightness decreased to " + brightness);
        }
    }
}