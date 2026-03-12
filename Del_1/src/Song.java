import java.time.Duration;

public class Song extends MediaItem implements Playable{

    private String artist;
    private Duration duration;

    public Song(String title, int durationSeconds, String artist){
        super(title, durationSeconds);
        this.artist = artist;
        duration = Duration.ofSeconds(durationSeconds);
    }

    public void play(){
        System.out.println("Now playing song: " + this.artist + " | " + this.getTitle() + " (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")");
    }

    public String toString(){
        return this.artist + " | " + this.getTitle() + " - (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")";
    }

}
