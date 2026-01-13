package controller;

import model.SponsorGeschenk;
import repository.SponsorGeschenkRepository;
import java.util.ArrayList;
import java.util.List;

class SponsorGeschenkController {
    private SponsorGeschenkRepository repo = new SponsorGeschenkRepository();

    public List<SponsorGeschenk> findAll() {
        return repo.getAllSponsorGeschenken();
    }

}
