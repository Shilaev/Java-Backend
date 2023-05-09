package Patterns.Structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        Flyweight flyweight = new Flyweight();

        List<Developer> developers = new LinkedList<>();

        developers.add(flyweight.getDeveloperBySpecialty("java"));
        developers.add(flyweight.getDeveloperBySpecialty("java"));
        developers.add(flyweight.getDeveloperBySpecialty("java"));
        developers.add(flyweight.getDeveloperBySpecialty("java"));

        developers.add(flyweight.getDeveloperBySpecialty("cpp"));
        developers.add(flyweight.getDeveloperBySpecialty("cpp"));
        developers.add(flyweight.getDeveloperBySpecialty("cpp"));

        for(Developer developer : developers){
            developer.getCode();
        }


    }
}
