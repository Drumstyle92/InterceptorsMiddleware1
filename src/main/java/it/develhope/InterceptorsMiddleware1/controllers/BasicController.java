package it.develhope.InterceptorsMiddleware1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Drumstyle92
 * Controller class that maps the path to which CRUD calls are then made
 */
@RestController
@RequestMapping("/time")
public class BasicController {

    /**
     * @return Returns the current time of the call in string format
     * Get method to know the precise time when using this method
     */
    @GetMapping()
    public String getCurrentTime() {

        return LocalDateTime.now().toString();

    }

}
