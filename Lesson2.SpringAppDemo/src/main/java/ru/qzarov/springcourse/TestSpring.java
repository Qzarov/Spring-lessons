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

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);

        context.close();
    }
}


/*
Homework:
- Create a list of 3 songs dor ClassicalMusic and 3 for RockMusic
- Music player have to integrate ClassicalMusic and RockMusic Beans
- Create enum class: CLASSICAL and ROCK
- playMusic() should play music depending on the value of enum class
- Playing sond should be random





*/