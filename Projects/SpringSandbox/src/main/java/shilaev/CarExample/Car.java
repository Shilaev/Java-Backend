package shilaev.CarExample;

public class Car {
    private String title;

    public Car(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }
}
