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

        // Music musicBean = context.getBean("rockMusic", Music.class);

        // MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        // musicPlayer.playMusic();

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.toString());

        context.close();
    }
}
