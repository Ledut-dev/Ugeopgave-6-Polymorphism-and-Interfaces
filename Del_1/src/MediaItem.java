public abstract class MediaItem {

    private String title;
    private int durationSeconds;

    public MediaItem(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle(){
        return this.title;
    }

    public int getDurationSeconds(){
        return this.durationSeconds;
    }

    public abstract String toString();
}
