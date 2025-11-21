package org.example.structural.facad;

public class SoundSystem {

    public void turnOn() {
        System.out.println("Sound System is turning on...");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }

    public void turnOff() {
        System.out.println("Sound System is turning off...");
    }
}
