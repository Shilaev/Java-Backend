package shilaev.CarExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarAppExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car myCar = context.getBean("carBean", Car.class);

        System.out.println(myCar.getTitle());
        myCar.startEngine();

        context.close();

    }
}
