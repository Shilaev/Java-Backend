package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyMethodInfo {
    String author() default "NoAuthor";

    int dateOfCreation() default  2022;

    String purpose() default "no description";
}

class TestAnnotation {

    @MyMethodInfo(author = "Author", dateOfCreation = 2022, purpose = "sout Hello")
    public void printHello() {
        System.out.println("Hello");
    }

    @MyMethodInfo
    public void printHello2(){
        System.out.println("Hello2");
    }

    public static void main(String[] args) {
        TestAnnotation myTestAnnotation = new TestAnnotation();
        myTestAnnotation.printHello();
    }
}