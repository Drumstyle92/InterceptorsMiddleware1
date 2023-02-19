package it.develhope.InterceptorsMiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Drumstyle92
 * Controller class that maps a path to then use the CRUD
 */
@RestController
@RequestMapping("/legacy")
public class LegacyController {

    /**
     * @return It returns a string but with the interceptor active it will block sending an HTTP GONE status
     * Get method used to try the reference interceptor
     */
    @GetMapping()
    public String getLegacyCode() {

        return "This is just old code";

    }

}
