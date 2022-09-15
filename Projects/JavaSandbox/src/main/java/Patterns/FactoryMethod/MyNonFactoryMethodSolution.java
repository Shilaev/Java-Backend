package Patterns;

class JavaDeveloper{
    public void getCode(){
        System.out.println("Code");
    }
}

class CppDeveloper{
    public void getCode(){
        System.out.println("Code");
    }
}

public class MyFactoryMethod {
    public static void main(String[] args) {
        JavaDeveloper jdeveloper = new JavaDeveloper();
        jdeveloper.getCode();

        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.getCode();
    }
}
