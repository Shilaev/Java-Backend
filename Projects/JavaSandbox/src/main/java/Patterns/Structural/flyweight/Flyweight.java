package Patterns.Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java" -> {
                    System.out.println("HR java dev...");
                    developer = new JavaDeveloper();
                }
                case "cpp" -> {
                    System.out.println("HR cpp dev...");
                    developer = new CppDeveloper();
                }
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
