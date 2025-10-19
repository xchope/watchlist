package htw.web.mywatchlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/api/movies")
    public List<Movie> getAll() {
        return List.of(
                new Movie(1L, "Dune: Part Two", "finished", 5),
                new Movie(2L, "Everything Everywhere All at Once", "planned", null),
                new Movie(3L, "Oppenheimer", "watching", 4)
        );
    }
}

