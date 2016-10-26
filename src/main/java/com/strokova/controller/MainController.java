package com.strokova.controller;

import com.strokova.model.Task;
import com.strokova.model.User;
import com.strokova.service.IFileLoadService;
import com.strokova.service.IHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    User user;
    @Autowired
    IHashService hashService;
    @Autowired
    IFileLoadService fileLoadService;

    @PostMapping(value = "/home")
    public ResponseEntity<Task> home(@RequestBody Task myTask) {
           myTask.setUserUUID(user.getUUID());
           myTask.setHash(hashService.getHashSum(fileLoadService.downloadFileData(myTask.getSrc()), myTask.getAlgo()));

        return ResponseEntity.ok().body(myTask);
    }
}

