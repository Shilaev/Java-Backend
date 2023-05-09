package Patterns.Structural.adapter;

public class JavaDBAdapter extends JavaApp implements Database{
    @Override
    public void insert() {
        this.saveObject();
    }

    @Override
    public void update() {
        this.updateObject();
    }

    @Override
    public void select() {
        this.loadObject();
    }

    @Override
    public void remove() {
        this.deleteObject();
    }

    @Override
    public void reducant() {

    }
}
