package Patterns.Creational.Builder;

public interface BakeBuilder {
    void setBase(String base);
    void setStuff(String stuff);
    void bake(int bakeTime);
}