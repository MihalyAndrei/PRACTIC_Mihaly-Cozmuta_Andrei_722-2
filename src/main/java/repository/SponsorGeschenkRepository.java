package repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.SponsorGeschenk;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EreignisRepository {
    private List<SponsorGeschenk> ereignisen = new ArrayList<>();

    public EreignisRepository() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ereignisen = mapper.readValue(new File("events.json"), new TypeReference<List<Ereignis>>(){});
        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }

    public List<Ereignis> getAllEreignisen() {
        return ereignisen;
    }
}