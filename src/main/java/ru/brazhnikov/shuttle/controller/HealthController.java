package ru.brazhnikov.shuttle.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@RestController
public class HealthController {

    /**
     * isAlive - action
     * @return
     */
    @RequestMapping(value = "/isAlive", method = RequestMethod.GET, produces = TEXT_PLAIN_VALUE)
    public String isAlive () {
        return "Hello, i am is alive!";
    }
}
