package controller;

import model.Ereignis;
import repository.EreignisRepository;
import java.util.ArrayList;
import java.util.List;

public class MovieController {
    private EreignisRepository repo = new EreignisRepository();

    // 1. Returnează tot
    public List<Ereignis> findAll() {
        return repo.getAllEreignisen();
    }

    public List<Ereignis> filterByMinRating(double minRating) {
        List<Ereignis> all = repo.getAllMovies();
        List<Movie> filtered = new ArrayList<>();

        for (Movie m : all) {
            if (m.getRating() >= minRating) {
                filtered.add(m);
            }
        }
        return filtered;
    }
}