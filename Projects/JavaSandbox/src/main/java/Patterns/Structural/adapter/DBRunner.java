package Patterns.Structural.adapter;

public class DBRunner {
    public static void main(String[] args) {
        Database database = new JavaDBAdapter();
        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
