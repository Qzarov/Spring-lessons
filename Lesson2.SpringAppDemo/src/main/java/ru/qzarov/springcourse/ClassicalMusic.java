package ru.qzarov.springcourse;

/**
 * @author Qzarov
 */
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    
    public void doInit() {
        System.out.println("ClassicalMusic initialization");
    }
    
    public void doDestroy() {
        System.out.println("ClassicalMusic destruction");
    }

    @Override
    public String getSong() {
        return "Tchaikovskiy - Swan's Lake";
    }
}
