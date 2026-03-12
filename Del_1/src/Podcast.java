import java.time.Duration;

public class Podcast extends MediaItem implements Playable{

    private String host;
    private Duration duration;

    public Podcast(String title, int durationSeconds, String host){
        super(title, durationSeconds);
        this.host = host;
        duration = Duration.ofSeconds(durationSeconds);
    }

    public void play(){
        System.out.println("Now playing podcast: " + this.host + " | " + this.getTitle() + " (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")");
    }

    public String toString(){
        return this.host + " | " + this.getTitle() + " - (" + duration.toHoursPart() + ":" + duration.toMinutesPart() + ":" + duration.toSecondsPart() + ")" ;
    }
}
