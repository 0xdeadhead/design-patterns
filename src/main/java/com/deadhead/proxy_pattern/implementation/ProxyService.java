package com.deadhead.proxy_pattern.implementation;

import java.util.Random;

import com.deadhead.proxy_pattern.specifications.Service;

public class ProxyService implements Service {

    private Service actualService;
    private Random random;

    @Override
    public String Operation() {
        return "<<<<< " + (isAuthorized() ? actualService.Operation() : "Operation Not Permitted") + " >>>>>";
    }

    private boolean isAuthorized() {
        return random.nextBoolean();
    }

    public ProxyService(Service actualService) {
        this.actualService = actualService;
        this.random = new Random();
    }

}
