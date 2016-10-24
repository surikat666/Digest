package com.strokova.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public interface IFileLoadService {
    byte[] downloadFileData(String src);
}
