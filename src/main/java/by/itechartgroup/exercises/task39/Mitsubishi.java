package by.itechartgroup.exercises.task39;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starts engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes";
    }
}
