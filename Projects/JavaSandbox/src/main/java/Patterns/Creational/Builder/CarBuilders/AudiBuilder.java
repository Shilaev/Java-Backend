package Patterns.Creational.Builder.CarBuilders;

public class AudiBuilder extends CarBuilder {
    @Override
    public void buildCompany() {
        car.setCompany("Audi");
    }

    @Override
    public void buildTitle() {
        car.setTitle("Audi S8");
    }

    @Override
    public void buildCost() {
        car.setCost(8_000_000);
    }
}
