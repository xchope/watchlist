package htw.webtech.mywatchlist.watchlist;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
        if (item.getType() == null) {
            item.setType("movie");
        }
        return repository.save(item);
    }
}

