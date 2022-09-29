package shilaev.musicPlayerExampleAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import shilaev.musicPlayerExampleAnnotation.MusicClasses.MusicGenres;

public class MySpringSolution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "musicPlayerExampleAnnotationResources/applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.printVolume());
        System.out.print(musicPlayer.playRandomSong(MusicGenres.NEOCLASSIC));

        context.close();
    }
}
