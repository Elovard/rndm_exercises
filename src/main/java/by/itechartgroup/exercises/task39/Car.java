package by.itechartgroup.exercises.task39;

public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Engine is starting " + getName();
    }

    public String accelerate() {
        return "Car " + getName() + " accelerates";
    }

    public String brake() {
        return "Car " + getName() + " brakes";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
