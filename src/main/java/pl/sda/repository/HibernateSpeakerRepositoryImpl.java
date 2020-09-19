package pl.sda.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import pl.sda.model.Speaker;

import java.util.ArrayList;
import java.util.List;


@Repository("speakerRepository")
@Profile("prod")
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
