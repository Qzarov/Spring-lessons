package ru.qzarov.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Qzarov
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setVolume(int volume) { this.volume = volume; }

    public int getVolume() { return volume; }

    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) { this.musicList = musicList; }

    public void playMusicList() {
        for(Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
