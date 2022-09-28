package shilaev.musicPlayerExampleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.Deathcore;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.MusicGenres;

import java.util.List;

public class MySpringSolution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "musicPlayerExampleAnnotationResources/applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.play(MusicGenres.DEATHCORE));

        context.close();
    }
}
