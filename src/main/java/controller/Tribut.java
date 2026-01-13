package controller;

import model.Tribut;
import repository.TributRepository;
import java.util.ArrayList;
import java.util.List;

class TributController {
    private TributRepository repo = new TributRepository();

    public List<Tribut> findAll() {
        return repo.getAllTributen();
    }

//    public List<Ereignis> filterByMinRating(double minRating) {
//        List<Ereignis> all = repo.getAllEreignisen();
//        List<Ereignis> filtered = new ArrayList<>();
//
//        for (Ereignis m : all) {
//            if (m.getDistrikt() = 'D') {
//                filtered.add(m);
//            }
//        }
//        return filtered;
//    }
}