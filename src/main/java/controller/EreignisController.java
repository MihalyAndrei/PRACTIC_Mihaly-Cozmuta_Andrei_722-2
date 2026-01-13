package controller;

import model.Ereignis;
import repository.EreignisRepository;
import java.util.ArrayList;
import java.util.List;

public class EreignisController{
    private EreignisRepository repository = new EreignisRepository();

    public List<Ereignis> findAll() {
        return repository.getAllEreignisen();
    }

}