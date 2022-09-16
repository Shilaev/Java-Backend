package Patterns.Creational.Builder;

public interface PizzaBuilder {
    void reset();
    void setDough();
    void setStuff();
    void bake();
}

interface 