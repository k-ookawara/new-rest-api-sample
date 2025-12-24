package jp.co.saunz.spring.trace.newrestapi;

import jp.co.saunz.spring.trace.newrestapi.example.MeteoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewRestApiApplication implements CommandLineRunner {

    private Logger log = LoggerFactory.getLogger(NewRestApiApplication.class);
    private final MeteoClient meteoClient;

    public NewRestApiApplication(MeteoClient meteoClient) {
        this.meteoClient = meteoClient;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(meteoClient.getForecast("52.52", "13.41", "weather_code", "Asia/Tokyo").toString());
    }

    public static void main(String[] args) {
        SpringApplication.run(NewRestApiApplication.class, args);
    }

}
