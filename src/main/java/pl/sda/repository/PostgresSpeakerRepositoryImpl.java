package pl.sda.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import pl.sda.model.Speaker;

import java.util.ArrayList;
import java.util.List;


@Repository("speakerRepository")
@Profile("dev")
public class PostgresSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> list = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstname("Zdzisław");
        speaker.setLastname("Chyba");

        list.add(speaker);
        return list;

    }
}
