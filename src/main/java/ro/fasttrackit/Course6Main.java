package ro.fasttrackit;

public class Course6Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "5", "White");

        System.out.println("Your " + bmw.getColour() + " car is going with speed: " + bmw.getSpeed());

        bmw.setSpeed(-5);
        System.out.println(bmw);

        bmw.displayDirection();
        bmw.goLeft();
        bmw.displayDirection();
    }
}
