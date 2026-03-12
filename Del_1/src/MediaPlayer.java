import java.util.ArrayList;

public class MediaPlayer{

    ArrayList<Playable> playlist = new ArrayList<>();

    public void add(Playable item){
        playlist.add(item);
    }

    public void playAll(){
        for (Playable media : playlist){
            media.play();
            System.out.println();
        }
    }

    public int getTotalDurationSeconds(){
        int totalSeconds = 0;
        for (Playable media : playlist){
            totalSeconds += media.getDurationSeconds();
        }
        return totalSeconds;
    }

    public void printPlaylist(){
        for (Playable media : playlist){
            System.out.println(media);
            System.out.println();
        }
    }

}
