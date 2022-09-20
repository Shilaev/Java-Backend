package Annotations;

public @interface MyAuthor {
    String name() default "Unnamed";
    int dateOfBirth() default 0;
}

class TestAnnotation{

    @MyAuthor(name = "name", dateOfBirth = 12)
    public static void main(String[] args) {

    }
}