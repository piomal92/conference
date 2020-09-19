package pl.sda.processor;

import org.springframework.beans.factory.InitializingBean;
import pl.sda.model.Speaker;

public class SpeakerProcessor implements InitializingBean {

    private Speaker speaker;

    public SpeakerProcessor(Speaker speaker) {
        this.speaker = speaker;
    }

    public SpeakerProcessor() {
    }

    public Speaker modifyLastname(){
        speaker.setLastname("Silly");
        return speaker;
    }




    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting up bean");
    }
}
