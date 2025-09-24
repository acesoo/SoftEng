package lab2;

public class SmartTV {
    private boolean isOn;
    private int channel;

    public SmartTV() {
        this.isOn = false;
        this.channel = 1; 
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Smart TV is ON, channel " + channel);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Smart TV is OFF");
    }

    public void changeChannelUp() {
        if (isOn) {
            channel++;
            System.out.println("Smart TV channel changed to " + channel);
        }
    }

    public void changeChannelDown() {
        if (isOn && channel > 1) {
            channel--;
            System.out.println("Smart TV channel changed to " + channel);
        }
    }
}
