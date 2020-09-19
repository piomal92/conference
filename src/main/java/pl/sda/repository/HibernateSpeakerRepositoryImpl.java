package pl.sda.repository;

import pl.sda.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> list = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstname("Eustachy");
        speaker.setLastname("Motyka");

        list.add(speaker);
        return list;

    }
}
