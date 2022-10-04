package ReflectionExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionScannerExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        // class_name1 class_name2 method_name
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.getConstructor().newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        method.invoke(o1, o2);

        System.out.println(o1);
    }
}
