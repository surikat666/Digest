package com.strokova.service;

import com.strokova.model.Algo;

import java.io.File;


public interface IHashService {
    String getHashSum (byte[] data, String algo);
}
