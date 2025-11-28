package htw.webtech.mywatchlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "htw.webtech.mywatchlist.watchlist")
@EntityScan(basePackages = "htw.webtech.mywatchlist.watchlist")
public class MywatchlistApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywatchlistApplication.class, args);
    }
}
