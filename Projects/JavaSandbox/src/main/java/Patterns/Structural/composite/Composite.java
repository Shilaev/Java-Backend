package Patterns.Structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new LinkedList<>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void execute() {
        children.forEach(Component::execute);
    }
}
