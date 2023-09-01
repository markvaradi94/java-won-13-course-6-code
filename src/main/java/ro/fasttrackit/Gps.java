package ro.fasttrackit;

public class Gps {
    private String direction;

    public void goNorth() {
        direction = "North";
    }

    public void goSouth() {
        direction = "South";
    }

    public void goEast() {
        direction = "East";
    }

    public void goWest() {
        direction = "West";
    }

    public String getDirection() {
        return direction;
    }
}
