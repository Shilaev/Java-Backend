package shilaev.musicPlayerExampleXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringSolution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "musicPlayerExampleXMLResources/applicationContext.xml");

        MusicPlayer myMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer myMusicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);

        myMusicPlayer.play();
        myMusicPlayer2.play();

        context.close();
    }
}
