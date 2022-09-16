package Patterns.Creational.Builder;

public class PizzaBuilder implements BakeBuilder {
    private String pizza = "";

    public String getPizza() {
        return pizza;
    }

    @Override
    public void setBase(String base) {
        pizza += "|base: " + base + "|" + "\n";
    }

    @Override
    public void setStuff(String stuff) {
        pizza += "|stuff: " + stuff + "|" + "\n";
    }

    @Override
    public void bake(int bakeTime) {
        pizza += "|bake time: " + bakeTime + "|" + "\n";
    }
}
