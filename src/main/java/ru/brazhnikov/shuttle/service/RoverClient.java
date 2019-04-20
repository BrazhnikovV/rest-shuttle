package ru.brazhnikov.shuttle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Component
public class RoverClient {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * getRoversUrls -
     * @return List<String>
     */
    public List<String> getRoversUrls() {
        return this.discoveryClient.getInstances("rover")
                              .stream()
                              .map(ServiceInstance::getUri)
                              .map(URI::toString)
                              .collect(Collectors.toList());
    }
}
