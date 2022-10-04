package ReflectionExample;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class MyReflectionExample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class personClass1 = MyPerson.class;

        MyPerson person = new MyPerson();
        Class personClass2 = person.getClass();

        Class personClass3 = Class.forName("ReflectionExample.MyPerson");

        List<Method> methods = List.of(personClass1.getDeclaredMethods());

        for (Method method : methods) {
            System.out.println(method.getReturnType() + " "
                    + method.getName() + "\t"
                    + method.getParameterTypes() + " "
                    + "();"
            );
        }

        List<Field> fields = List.of(personClass1.getDeclaredFields());

        for (Field field : fields) {
            System.out.println(field.getType() + " "
                    + field.getName());
        }
    }
}
