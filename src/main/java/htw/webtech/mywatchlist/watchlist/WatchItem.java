package htw.webtech.mywatchlist.watchlist;

public class WatchItem {
    private Long id;
    private String title;
    private String type; // "movie" oder "series"
    private boolean watched;
    private int rating; // 0-10

    public WatchItem() { }

    public WatchItem(Long id, String title, String type, boolean watched, int rating) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.watched = watched;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public boolean isWatched() { return watched; }
    public void setWatched(boolean watched) { this.watched = watched; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}
