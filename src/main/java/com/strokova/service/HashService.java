package com.strokova.service;

import com.strokova.exception.HashSumException;
import com.strokova.model.Algo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class HashService implements IHashService {
    public String getHashSum(byte[] data, String algo) {
        try {
            if (Algo.MD5.getCode().equals(algo)) return DigestUtils.md5Hex(data);
            else if (Algo.SHA1.getCode().equals(algo)) return DigestUtils.sha1Hex(data);
            else if (Algo.SHA256.getCode().equals(algo)) return DigestUtils.sha256Hex(data);
            else throw new HashSumException();
        } catch (HashSumException e) {
            e.getMessage();
        }
        return null;

    }
}
