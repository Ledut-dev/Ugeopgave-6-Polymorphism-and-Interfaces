import java.time.Duration;
import java.util.ArrayList;

public class Main_1 {

    public static void main(String[] args){

        MediaPlayer playlist = new MediaPlayer();
        playlist.add(new Song("Loop", 118, "SXYGX"));
        playlist.add(new Song("tea", 129, "gabby start"));
        playlist.add(new Song("ketamine", 95, "NXTY"));
        playlist.add(new Podcast("The PoddyC", 5899, "Max, Dorki, Dratnos"));
        playlist.add(new Podcast("Safety Third", 5546, "William Osman, NileRed"));
        playlist.add(new AudioBook("Some book", 5489, "John Smith"));

        playlist.playAll();
        System.out.println();
        playlist.printPlaylist();
        System.out.println();

        Duration totalDuration = Duration.ofSeconds(playlist.getTotalDurationSeconds());
        System.out.println("Total duration: " + totalDuration.toHoursPart() + ":" + totalDuration.toMinutesPart() + ":" + totalDuration.toSecondsPart());


    }
}
