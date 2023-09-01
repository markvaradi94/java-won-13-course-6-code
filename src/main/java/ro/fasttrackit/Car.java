package ro.fasttrackit;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private int speed;

    private Gps gps = new Gps();

    public Car(String brand, String model, String colour, int speed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.speed = speed;
    }

    public Car(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.speed = 0;
    }

    public void goLeft() {
        gps.goWest();
    }

    public void goRight() {
        gps.goEast();
    }

    public void goUp() {
        gps.goNorth();
    }

    public void goDown() {
        gps.goSouth();
    }

    public void displayDirection() {
        System.out.println(gps.getDirection());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (checkSpeed(speed)) {
            System.out.println("Invalid value");
        } else {
            this.speed = speed;
        }
    }

    private boolean checkSpeed(int speed) {
        return speed < 0;
    }

    protected void test() {
        System.out.println("Protected method");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}
