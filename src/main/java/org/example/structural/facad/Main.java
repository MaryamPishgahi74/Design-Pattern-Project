package org.example.structural.facad;

public class Main {

    public static void main(String[] args) {

            TV tv = new TV();
            DVDPlayer dvdPlayer = new DVDPlayer();
            SoundSystem soundSystem = new SoundSystem();

            HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvdPlayer, soundSystem);

            // شروع تماشای فیلم
            homeTheater.watchMovie();
            System.out.println("---");

            // پایان تماشای فیلم
            homeTheater.endMovie();
    }
}
