package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.processor.SpeakerProcessor;
import pl.sda.model.Speaker;
import pl.sda.repository.SpeakerRepository;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;
    private SpeakerProcessor speakerProcessor;

    public SpeakerServiceImpl() {
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository, SpeakerProcessor speakerProcessor) {
        this.speakerRepository = speakerRepository;
        this.speakerProcessor = speakerProcessor;
        System.out.println("Constructor injection " + speakerRepository + " " + speakerProcessor);
    }


    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakerList = speakerRepository.findAll();

        Speaker speaker = speakerRepository.findAll().get(0);
        speakerProcessor.setSpeaker(speaker);
        speakerProcessor.modifyLastname();
        speakerList.add(0,speaker);
        return speakerList;
    }


    public void setSpeakerProcessor(SpeakerProcessor speakerProcessor) {
        this.speakerProcessor = speakerProcessor;
    }


    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("setter injection");
        this.speakerRepository = speakerRepository;
    }
}