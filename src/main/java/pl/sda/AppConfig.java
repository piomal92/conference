package pl.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.sda.processor.SpeakerProcessor;
import pl.sda.processor.SpeakerProcessorProd;

@Configuration
@ComponentScan({"pl.sda"})
public class AppConfig {

    @Bean
    public SpeakerProcessor getSpeakerProcessor(){
        return new SpeakerProcessor();
    }
    @Bean("speakerProcessor")
    public SpeakerProcessorProd getSpeakerProd(){
        return new SpeakerProcessorProd();
    }


//    @Bean(name="speakerService")
//    @Scope(value = "prototype")
//    public SpeakerService getSpeakerService(){
//        return new SpeakerServiceImpl();
//    }
//
//    @Bean(name="speakerRepository")
//    @Scope(value = "singleton")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
