package htw.webtech.mywatchlist.watchlist;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://watchlist-vuih.onrender.com"
})
@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    private final WatchItemRepository repository;

    public WatchlistController(WatchItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<WatchItem> getWatchlist() {
        return repository.findAll();
    }

    @PostMapping
    public WatchItem create(@RequestBody WatchItem item) {
        // einfache Defaults, falls Frontend nur title schickt
        if (item.getType() == null) {
            item.setType("movie");
        }
        // finished/rating bleiben Standardwerte (false / 0), wenn nicht gesetzt

        return repository.save(item);
    }
}

