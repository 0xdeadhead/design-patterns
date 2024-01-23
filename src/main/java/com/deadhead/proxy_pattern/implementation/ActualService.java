package com.deadhead.proxy_pattern.implementation;

import com.deadhead.proxy_pattern.specifications.Service;

public class ActualService implements Service {

    @Override
    public String Operation() {
        return "From Actual Service";
    }

}
