package ru.brazhnikov.shuttle.controller;

import java.util.List;

import ru.brazhnikov.shuttle.dto.Planet;
import ru.brazhnikov.shuttle.entity.Rover;
import ru.brazhnikov.shuttle.service.RoverClient;
import ru.brazhnikov.shuttle.service.RoverService;
import ru.brazhnikov.shuttle.service.RoverDiscoveryPlanet;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@RestController
public class RoverController {

    @Autowired
    private RoverService roverService;

    @Autowired
    private RoverClient roverClient;

    @Autowired
    private RoverDiscoveryPlanet roverDiscoveryPlanet;

    @RequestMapping(value = "/rover/all", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Rover> getAllRevers() {
        return this.roverService.getAllRovers();
    }

    @RequestMapping(value = "/rover/available", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<String> getAlailableRovers() {
        return roverClient.getRoversUrls();
    }

    @RequestMapping(value = "/rover/discover", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public List<Planet> discoverPlanets() {
        return this.roverDiscoveryPlanet.getDiscoveryListPlanet();
    }
}
