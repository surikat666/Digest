package com.strokova.service;

import com.strokova.model.Algo;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;


public class HashService implements IHashService {
    public String getHashSum(byte[] data, String algo) {
        if ("md5".equals(Algo.MD5)) return DigestUtils.md5Hex(data);
        if ("sha-1".equals(Algo.SHA1)) return DigestUtils.sha1Hex(data);
        if ("sha-256".equals(Algo.SHA256)) return DigestUtils.sha256Hex(data);
        return null;
    }
}
