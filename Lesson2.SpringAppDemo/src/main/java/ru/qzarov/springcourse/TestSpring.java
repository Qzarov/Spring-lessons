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

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        //musicPlayer.playMusicList();

        context.close();
    }
}
