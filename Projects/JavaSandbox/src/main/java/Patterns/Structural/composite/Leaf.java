package Patterns.Structural.composite;

/**
 * Простой элемент дерева без ответвлений
 */
public class Leaf implements Component {
    private final int id;

    public Leaf(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("leaf " + id);
    }
}
