package ReflectionExample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class MyReflectionClass {
    public int field1 = 0;
    private int field2 = 0;

    private void method1() {
    }

    public void method2() {
    }
}

public class MyReflectionClassExample {
    public static void main(String[] args) {
        Class myReflectionClassClass = MyReflectionClass.class;


        Field[] fields = myReflectionClassClass.getFields();
        Method[] methods = myReflectionClassClass.getDeclaredMethods();

        for(Field field : fields){
            System.out.println(field.getName());
        }

        for(Method method: methods){
            System.out.println(method.getName());
        }
    }
}
