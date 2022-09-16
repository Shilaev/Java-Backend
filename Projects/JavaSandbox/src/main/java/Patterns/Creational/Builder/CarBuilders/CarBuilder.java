package Patterns.Creational.Builder;

public abstract class CarBuilder {
    Car car;

    public void buildCar() {
        car = new Car();
    }

    abstract void buildCompany();

    abstract void buildTitle();

    abstract void buildCost();

    public Car getCar() {
        return car;
    }
}
