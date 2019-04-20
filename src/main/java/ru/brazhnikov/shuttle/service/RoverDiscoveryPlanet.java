package ru.brazhnikov.shuttle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.brazhnikov.shuttle.dto.Planet;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Service
public class RoverDiscoveryPlanet {

    @Autowired
    private RoverClient roverClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * getDiscoveryListPlanet -
     * @return List<Planet>
     */
    public List<Planet> getDiscoveryListPlanet() {
        List<Planet> planetList = new ArrayList<>();
        final ArrayList<String> roverUrs = (ArrayList<String>) roverClient.getRoversUrls();
        for (String url : roverUrs) {
            planetList.add(restTemplate.getForObject(url + "/discover/planet", Planet.class));
        }
        return planetList;
    }
}
