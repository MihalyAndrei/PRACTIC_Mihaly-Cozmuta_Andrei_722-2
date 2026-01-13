package repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Tribut;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TributRepository {
    private List<Tribut> tributen = new ArrayList<>();

    public TributRepository() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            tributen = mapper.readValue(new File("events.json"), new TypeReference<List<Tribut>>(){});
        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
    }

    public List<Tribut> getAllEreignisen() {
        return tributen;
    }
}
