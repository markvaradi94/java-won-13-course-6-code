package ro.fasttrackit;

public class Main {
    public static void main(String[] args) {
//        First first = new First();
//        First first2 = new First();
//        First first3 = new First();
//
//        first.display();
//        first2.display();

        Lamp lamp = new Lamp();
        lamp.displayState();

        Lamp lamp2 = new Lamp(true);
        lamp2.displayState();

        lamp2.turnOff();
        lamp2.displayState();

        Lamp lamp3 = new Lamp(true, "Blue", 20);
        System.out.println(lamp3);

        lamp3.increaseIntensity(50);
        System.out.println(lamp3);

        lamp3.increaseIntensity(100);
        System.out.println(lamp3);

        Lamp lamp3v2 = lamp3.crtObject();
        System.out.println(lamp3v2);

        Calculator calc = new Calculator();
        int sum = calc.sum(5, 6);

        int[] array = {1, 2, 3, 4, 5};
        int length = array.length;

        String str = "hello";
        int length1 = str.length();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}