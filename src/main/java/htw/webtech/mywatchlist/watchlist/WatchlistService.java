package htw.webtech.mywatchlist.watchlist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchlistService {

    private final WatchItemRepository repository;

    public WatchlistService(WatchItemRepository repository) {
        this.repository = repository;
    }

    public List<WatchItem> findAll() {
        return repository.findAll();
    }

    public WatchItem create(WatchItem item) {
        // einfache Defaults / Validierung
        if (item.getTitle() == null || item.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title must not be empty");
        }

        if (item.getType() == null || item.getType().isBlank()) {
            item.setType("movie");
        }

        if (item.getRating() < 0) {
            item.setRating(0);
        }
        if (item.getRating() > 10) {
            item.setRating(10);
        }

        return repository.save(item);
    }

    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}

