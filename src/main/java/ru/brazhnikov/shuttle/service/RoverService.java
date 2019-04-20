package ru.brazhnikov.shuttle.service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import ru.brazhnikov.shuttle.entity.Rover;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ru.brazhnikov.shuttle.entity.repository.RoverRepository;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Service
@Slf4j
public class RoverService {

    private final RoverRepository roverRepository;

    @Autowired
    public RoverService (RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    /**
     * getAllRovers -
     * @return List<Rover>
     */
    public List<Rover> getAllRovers() {
        log.info("Get all rovers");
        return this.roverRepository.findAll();
    }
}
