package pl.sda.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import pl.sda.model.Speaker;

public class SpeakerProcessor implements InitializingBean {

    private Speaker speaker;
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double seedNum;

    public SpeakerProcessor(Speaker speaker) {
        this.speaker = speaker;
    }

    public SpeakerProcessor() {
    }

    public Speaker modifyLastname(){
        speaker.setLastname("Silly");
        System.out.println("seedNum: " + seedNum);
        return speaker;
    }


    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
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
