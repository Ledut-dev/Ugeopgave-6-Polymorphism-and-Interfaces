public class Song extends MediaItem implements Playable{

    private String artist;

    public MediaItem(String title, int durationSeconds){
        super(title, durationSeconds);
    }

}
