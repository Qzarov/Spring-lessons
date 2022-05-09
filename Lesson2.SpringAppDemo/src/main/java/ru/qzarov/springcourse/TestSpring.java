package ru.qzarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Qzarov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        //Music musicBean = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        musicPlayer.playMusicList();

        context.close();
    }
}
