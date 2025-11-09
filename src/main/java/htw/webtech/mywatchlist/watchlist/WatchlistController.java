package htw.webtech.mywatchlist.watchlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.Arrays;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    @GetMapping("/watchlist")
    public List<WatchItem> getWatchlist() {
        return Arrays.asList(
                new WatchItem(1L, "The Matrix", "movie", true, 9),
                new WatchItem(2L, "Breaking Bad", "series", true, 10),
                new WatchItem(3L, "Dune: Part Two", "movie", false, 0)
        );
    }
}
