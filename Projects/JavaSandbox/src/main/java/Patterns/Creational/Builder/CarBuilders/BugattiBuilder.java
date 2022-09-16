package Patterns.Creational.Builder.CarBuilders;

public class BugattiBuilder extends CarBuilder{

    @Override
    public void buildCompany() {
        car.setCompany("Bugatti");
    }

    @Override
    public void buildTitle() {
        car.setTitle("Bugatti S5");
    }

    @Override
    public void buildCost() {
        car.setCost(18_000_000);
    }
}
