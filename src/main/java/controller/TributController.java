package controller;

import model.Tribut;
import repository.TributRepository;
import java.util.ArrayList;
import java.util.List;

public class TributController {
    private TributRepository repository = new TributRepository();

    public List<Tribut> findAll() {
        return repository.getAllTributen();
    }


    public List<Tribut> filterByDistriktAndStatus() {
        List<Tribut> all = repository.getAllTributen();
        List<Tribut> filtered = new ArrayList<>();

        for (Tribut m : all) {
            if (m.getDistrikt() == 'D' && m.getStatus() == 'LEBENDIG') {
                filtered.add(m);
            }
        }
        return filtered;
    }

    public List<Tribut> sortBySkillLeve(){
        List<Tribut> all = repository.getAllTributen();
        List<Tribut> sorted = new ArrayList<>();
        sorted.addAll(all);
        sorted.sort((t1, t2) -> Integer.compare(t2.getSkillLevel(), t1.getSkillLevel()));
        return sorted;
    }

    public List<Tribut> sortByName(){
        List<Tribut> all = repository.getAllTributen();
        List<Tribut> sorted = new ArrayList<>();
        sorted.addAll(all);
        sorted.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
        return sorted;
    }

    public List<Tribut> checkEventyp(){
        List<Tribut> all = repository.getAllTributen();
        List<Tribut> filtered = new ArrayList<>();

        for (Tribut m : all) {
            if (m.getEventyp() == 'SPONSORED') {
                filtered.add(m);
            }
        }
        return filtered;
    }
}

