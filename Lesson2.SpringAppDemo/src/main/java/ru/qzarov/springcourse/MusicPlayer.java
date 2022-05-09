package ru.qzarov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Qzarov
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) { 
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic; 
    }

    //@Autowired
    //public void setMusic(Music music) { this.music = music; }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
        //System.out.println("Playing: " + classicalMusic.getSong());
        //System.out.println("Playing: " + rockMusic.getSong());
    }
}
