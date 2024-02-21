package co.pitam.demo3.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * the controller for hello world
 * <p>
 * the CRUD for hello
 * </p>
 */
@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
@Slf4j
public class HelloWorld {
    /**
     * <p>this controller return Hello World!! with random UUID</p>
     *
     * @return string
     */
    private final RestTemplate restTemplate;

    @Value("${URL2}")
    private String urlForService;

    @GetMapping
    public String hello() {
        String s = "Hello World!! " + UUID.randomUUID();
        log.info("returning: {}", s);
        return s;
    }

    /**
     * <p>this controller return Beer! Hello World!! with random UUID</p>
     *
     * @return String
     */
    @GetMapping("/beer")
    public String helloBeer() {
        String s = "Beer!! Hello World!! " + UUID.randomUUID();
        log.info("returning: {}", s);
        return s;
    }

    @GetMapping("/service")
    public String service2Hello() {
        String responseFromService2 = restTemplate.getForEntity(urlForService + "/api/v1/hello", String.class).getBody();
        log.info("respond from service 2: {}",responseFromService2);
        return responseFromService2;
    }
}
