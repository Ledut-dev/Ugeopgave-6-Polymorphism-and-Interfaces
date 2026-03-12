import java.time.Duration;

public class AudioBook extends MediaItem implements Playable{

    private String author;
    private Duration duration;

    public AudioBook(String title, int durationSeconds, String author){
        super(title, durationSeconds);
        this.author = author;
        duration = Duration.ofSeconds(durationSeconds);
    }

    public void play(){
        System.out.println("Now playing audiobook: " + this.author + " | " + this.getTitle() + " (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")");
    }

    public String toString(){
        return this.author + " | " + this.getTitle() + " - (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")";
    }
}
