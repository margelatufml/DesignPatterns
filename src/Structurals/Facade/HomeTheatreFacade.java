public class HomeTheatreFacade {
    private DVDPlayer dvd;
    private Projector proiector;
    private SoundSystem sound;

    public HomeTheatreFacade(DVDPlayer dvd, SoundSystem sound, Projector proiector) {
        this.dvd = dvd;
        this.sound = sound;
        this.proiector = proiector;
    }

    public void watchMovie(String movie){
        System.out.println("Pregatire pentru vizionarea filmului....");
        proiector.on();
        proiector.setInput("DVD");
        proiector.on();
        sound.on();
        sound.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Oprire sistem home theatre....");
        dvd.stop();
        dvd.off();
        proiector.off();
        sound.off();
    }
}
