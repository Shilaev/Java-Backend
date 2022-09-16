package Patterns.Creational.Builder;

public class BuilderSolution {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.setBase("Тесто");
        pizzaBuilder.setStuff("Дохуя вкусной шняги и ананасы");
        pizzaBuilder.bake(80);
        System.out.println(pizzaBuilder.getPizza());
    }
}
