package htw.webtech.mywatchlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class WatchlistControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Test für GET /api/watchlist
    @Test
    void shouldReturnAllWatchItems() throws Exception {
        mockMvc.perform(get("/api/watchlist"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray()) // Prüft, dass die Antwort eine Liste ist
                .andExpect(jsonPath("$[0].title").value("The Matrix")); // Beispiel für einen Eintrag
    }

    // Test für POST /api/watchlist
    @Test
    void shouldCreateNewWatchItem() throws Exception {
        String newItem = "{ \"title\": \"Inception\", \"type\": \"movie\", \"finished\": false, \"rating\": 8 }";

        mockMvc.perform(post("/api/watchlist")
                        .contentType("application/json")
                        .content(newItem))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Inception"))
                .andExpect(jsonPath("$.rating").value(8));
    }
}
