package lab2;

public class Fan {
    private boolean isOn;
    private int speed;

    public Fan() {
        this.isOn = false;
        this.speed = 1; 
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Fan is ON at speed " + speed);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan is OFF");
    }

    public void increaseSpeed() {
        if (isOn && speed < 3) {
            speed++;
            System.out.println("Fan speed increased to " + speed);
        }
    }

    public void decreaseSpeed() {
        if (isOn && speed > 1) {
            speed--;
            System.out.println("Fan speed decreased to " + speed);
        }
    }
}