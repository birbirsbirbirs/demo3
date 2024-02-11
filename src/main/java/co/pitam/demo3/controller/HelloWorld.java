package co.pitam.demo3.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * the controller for hello world
 * <p>
 *     the CRUD for hello
 * </p>
 */
@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
@Slf4j
public class HelloWorld {
    /**
     * <p>this controller return Hello World!! with random UUID</p>
     * @return string
     */
    @GetMapping
    public String hello(){
        String s = "Hello World!! " + UUID.randomUUID();
        log.info("returning: {}",s);
        return  s;
    }

    /**
     * <p>this controller return Beer! Hello World!! with random UUID</p>
     * @return String
     */
    @GetMapping("/beer")
    public String helloBeer(){
        String s = "Beer!! Hello World!! " + UUID.randomUUID();
        log.info("returning: {}",s);
        return  s;
    }
}
