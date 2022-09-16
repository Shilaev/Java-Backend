package Patterns.Creational.Builder;

import Patterns.Creational.Builder.CarBuilders.AudiBuilder;
import Patterns.Creational.Builder.CarBuilders.BugattiBuilder;
import Patterns.Creational.Builder.CarBuilders.CarBuilder;

public class CarFactory {

    static CarBuilder carBuilder;

    public static void setCarBuilder(CarBuilder carBuilderType) {
        carBuilder = carBuilderType;
    }

    public static Car buildCar() {
        carBuilder.buildCar();
        carBuilder.buildCompany();
        carBuilder.buildTitle();
        carBuilder.buildCost();

        return carBuilder.getCar();
    }

    public static void main(String[] args) {
        setCarBuilder(new AudiBuilder());
        Car car = buildCar();
        System.out.println(car);
    }
}
