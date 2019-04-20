package ru.brazhnikov.shuttle.entity.repository;

import ru.brazhnikov.shuttle.entity.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoverRepository extends JpaRepository<Rover, Long> {

}
