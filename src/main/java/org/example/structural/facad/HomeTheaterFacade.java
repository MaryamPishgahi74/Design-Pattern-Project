package org.example.structural.facad;

public class HomeTheaterFacade {

    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        dvdPlayer.turnOn();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.turnOff();
        soundSystem.turnOff();
        tv.turnOff();
    }
}
