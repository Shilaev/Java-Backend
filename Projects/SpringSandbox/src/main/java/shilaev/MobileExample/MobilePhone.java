package shilaev.MobileExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobilePhone {
    String modelTitle = "";

    public MobilePhone(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "modelTitle='" + modelTitle + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MobilePhone mobilePhone = context.getBean("mobilePhoneBean", MobilePhone.class);

        System.out.println(mobilePhone);

        context.close();
    }
}
