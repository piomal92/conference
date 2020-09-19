package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;
import pl.sda.service.SpeakerService;
import pl.sda.service.SpeakerServiceImpl;



public class Application {

    public static void main(String[] args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerServiceImpl.class);

        System.out.println(speakerService.findAll().get(0).getFirstname());

    }
}
