package htw.web.mywatchlist;

public class Movie {
    private Long id;
    private String title;
    private String status;   // planned | watching | finished
    private Integer rating;  // 1..5 or null

    public Movie() {}

    public Movie(Long id, String title, String status, Integer rating) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }
}
