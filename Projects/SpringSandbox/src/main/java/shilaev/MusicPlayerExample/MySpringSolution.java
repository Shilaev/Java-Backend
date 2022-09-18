package shilaev.MusicPlayerExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringSolution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer myMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        myMusicPlayer.play();

        MusicPlayer myMusicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(myMusicPlayer2.equals(myMusicPlayer));

        context.close();
    }
}
