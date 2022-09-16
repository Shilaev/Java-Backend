package Patterns.Creational.Builder.CarBuilders;

public abstract class CarBuilder {
    Car car;

    public void buildCar() {
        car = new Car();
    }

    public abstract void buildCompany();

    public abstract void buildTitle();

    public abstract void buildCost();

    public Car getCar() {
        return car;
    }
}
