package Patterns.FactoryMethod;

class JavaDeveloper{
    public void getCode(){
        System.out.println("Java Code");
    }
}

class CppDeveloper{
    public void getCode(){
        System.out.println("Cpp Code");
    }
}

public class MyNonFactoryMethodSolution {
    public static void main(String[] args) {
        JavaDeveloper jdeveloper = new JavaDeveloper();
        jdeveloper.getCode();

        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.getCode();
    }
}
