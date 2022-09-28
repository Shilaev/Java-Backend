package shilaev.musicPlayerExampleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MySpringSolution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "musicPlayerExampleAnnotationResources/applicationContext.xml");

        MusicPlayer musicPlayer0 = context.getBean("musicPlayer", MusicPlayer.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

//        System.out.println(musicPlayer0.play());

        context.close();
    }
}
