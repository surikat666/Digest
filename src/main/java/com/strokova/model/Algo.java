package com.strokova.model;


public enum Algo {
    MD5("md5"),
    SHA1("sha-1"),
    SHA256("sha-256");

    private String code;

    private Algo(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
