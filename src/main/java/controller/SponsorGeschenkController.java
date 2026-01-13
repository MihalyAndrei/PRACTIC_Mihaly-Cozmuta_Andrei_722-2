package controller;

import model.SponsorGeschenk;
import repository.SponsorGeschenkRepository;
import java.util.ArrayList;
import java.util.List;

public class SponsorGeschenkController {
    private SponsorGeschenkRepository repository = new SponsorGeschenkRepository();

    public List<SponsorGeschenk> findAll() {
        return repository.getAllSponsorGeschenken();
    }

}
