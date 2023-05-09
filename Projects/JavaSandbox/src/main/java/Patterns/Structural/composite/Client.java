package Patterns.Structural.composite;

public class Client {
    public static void main(String[] args) {
        Component component1 = new Leaf(1);
        Component component2 = new Leaf(2);
        Component component3 = new Leaf(3);

        Composite box = new Composite();
        box.add(component1);
        box.add(component2);
        box.add(component3);

        Component component4 = new Leaf(4);

        Composite bigBox = new Composite();
        bigBox.add(box);
        bigBox.add(component4);


        bigBox.execute();
    }
}
