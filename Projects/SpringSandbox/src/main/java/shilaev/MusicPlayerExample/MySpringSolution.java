package shilaev.MusicPlayerExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer myMusicPlayer = new MusicPlayer(music);
        myMusicPlayer.play();

        context.close();
    }
}
