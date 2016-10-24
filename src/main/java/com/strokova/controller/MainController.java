package com.strokova.controller;

import com.strokova.model.Task;
import com.strokova.model.User;
import com.strokova.service.IFileLoadService;
import com.strokova.service.IHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    User user;
    @Autowired
    IHashService hashService;
    @Autowired
    IFileLoadService fileLoadService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Task home() {
        Task myTask = new Task();
        String src = "https://www.linkedin.com/robots.txt";
        String algo = "md5";
        myTask.setUserUUID(user.getUUID());
        myTask.setSrc(src);
        myTask.setAlgo(algo);
        myTask.setHash(hashService.getHashSum(fileLoadService.downloadFileData(src), algo));
        return myTask;
    }
}

