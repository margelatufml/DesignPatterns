package Structurals.Facade;//facade: simplifica interactiunea cu un subsistem complex

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(dvd, sound,projector);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();    }
}