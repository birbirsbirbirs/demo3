package co.pitam.demo3.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class PitamCommandLineRunner implements CommandLineRunner {
    @Value("${URL2}")
    private String urlForService;
    @Override
    public void run(String... args) throws Exception {
        log.info("URL2 value is: {}",urlForService);
    }
}
