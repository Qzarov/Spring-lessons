package ru.qzarov.springcourse;

/**
 * @author Qzarov
 */
public class MusicPlayer {
    private Music music;
    
    // Invertion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
