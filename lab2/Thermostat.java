package lab2;

public class Thermostat {
    private int temperature;

    public Thermostat() {
        this.temperature = 20; 
    }

    public void increaseTemperature() {
        temperature += 1;
        System.out.println("Thermostat temperature increased to " + temperature + "°C");
    }

    public void decreaseTemperature() {
        temperature -= 1;
        System.out.println("Thermostat temperature decreased to " + temperature + "°C");
    }
}
