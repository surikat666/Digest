package com.strokova.service;

import com.strokova.model.Algo;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public interface IHashService {
    String getHashSum (byte[] data, String algo);
}
