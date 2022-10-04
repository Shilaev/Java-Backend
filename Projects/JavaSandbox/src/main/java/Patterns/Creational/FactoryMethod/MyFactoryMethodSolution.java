package Patterns.Creational.FactoryMethod;

interface DeveloperFactory {
    Developer createDeveloper();
}

final class KotlinDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}

final class CsharpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CsharpDeveloper();
    }
}

interface Developer {
    void getCode();
}

class KotlinDeveloper implements Developer {
    @Override
    public void getCode() {
        System.out.println("Kotlin code");
    }

    public void getAdditionalCode() {
        System.out.println("Additional");
    }
}

class CsharpDeveloper implements Developer {
    @Override
    public void getCode() {
        System.out.println("Csharp code");
    }
}

public class MyFactoryMethodSolution {
    public static void main(String[] args) {
        DeveloperFactory kotlinDeveloperFactory = new KotlinDeveloperFactory();
        DeveloperFactory CsharpDeveloperFactory = new CsharpDeveloperFactory();

        Developer kotlinDeveloper = kotlinDeveloperFactory.createDeveloper();
        Developer csharpDeveloper = CsharpDeveloperFactory.createDeveloper();

        kotlinDeveloper.getCode();

        KotlinDeveloper kotlinDeveloper1 = new KotlinDeveloper();
        kotlinDeveloper1.getAdditionalCode();
    }
}
