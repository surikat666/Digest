package com.strokova.controller;

import com.strokova.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    User user;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

        return user.getUUID();
    }
}

