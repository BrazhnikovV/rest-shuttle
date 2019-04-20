package ru.brazhnikov.shuttle.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @version 1.0.1
 * @author Vasily Brazhnikov
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Planet {

    /**
     *  @access private
     *  @var String name -
     */
    private String name;
}
