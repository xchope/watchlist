package htw.webtech.mywatchlist.watchlist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    private final WatchlistService service;

    public WatchlistController(WatchlistService service) {
        this.service = service;
    }

    // GET /api/watchlist
    @GetMapping
    public List<WatchItem> getWatchlist() {
        return service.findAll();
    }

    // POST /api/watchlist
    @PostMapping
    public ResponseEntity<WatchItem> create(@RequestBody WatchItem item) {
        WatchItem created = service.create(item);
        return ResponseEntity.ok(created);
    }

    // DELETE /api/watchlist/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

