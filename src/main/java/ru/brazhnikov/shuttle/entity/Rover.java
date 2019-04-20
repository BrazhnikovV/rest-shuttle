package ru.brazhnikov.shuttle.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@Data
@Entity
@NoArgsConstructor
public class Rover {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String model;

    /**
     * constructor
     * @param name
     * @param model
     */
    public Rover(String name, String model) {
        this.name  = name;
        this.model = model;
    }
}
