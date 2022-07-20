package JavaSyntaxis.Collections;


import java.util.ArrayList;
import java.util.Comparator;


class Car {

    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Comparator<Car> carComparator = Comparator.comparingInt(Car::getMaxSpeed);

        cars.sort(carComparator);

        for (Car car : cars) System.out.println(car.getModel());
    }
}
