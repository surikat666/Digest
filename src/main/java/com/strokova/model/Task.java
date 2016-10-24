package com.strokova.model;


public class Task {
    private String userUUID;
    private String src;
    private String algo;
    private String hash;

    public Task() {

    }
    public Task(String userUUID, String src, String algo) {
        this.src = src;
        this.algo = algo;
        this.userUUID = userUUID;
    }
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
