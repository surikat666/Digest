package com.strokova;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import static java.util.UUID.randomUUID;

//@Component
//@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User {
    private String UUID = randomUUID().toString();

    public String getUUID() {
        return UUID;
    }
}
