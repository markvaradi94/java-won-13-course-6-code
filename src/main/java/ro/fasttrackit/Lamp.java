package ro.fasttrackit;

public class Lamp {
    private boolean isOn;
    private String colour;
    private int intensity;

    Lamp() {
        System.out.println("Lamp created");
    }

    Lamp(boolean isOn) {
        this.isOn = isOn;
    }

    Lamp(boolean isOn, String colour, int intensity) {
        this.isOn = isOn;
        this.colour = colour;
        this.intensity = intensity;
    }

    public void displayState() {
        System.out.println("Lamp is on: " + isOn);
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseIntensity(int amount) {
        if (intensity + amount > 120) {
            System.out.println("Cannot go higher than 120");
            intensity = 120;
        } else {
            intensity += amount;
        }
    }

    public Lamp crtObject() {
        return this;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "isOn=" + isOn +
                ", colour='" + colour + '\'' +
                ", intensity=" + intensity +
                '}';
    }
}
