package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Constructon injection");
        this.speakerRepository = speakerRepository;
    }
    public SpeakerServiceImpl(){

    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("Setter injection");
        this.speakerRepository = speakerRepository;
    }
}