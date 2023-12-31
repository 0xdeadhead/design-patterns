package com.deadhead.observer_pattern.implementation;

import com.deadhead.observer_pattern.specifications.Observer;
import com.deadhead.observer_pattern.specifications.Subject;

public class StatsDisplay implements Observer {

    private String displayName;

    @Override
    public void update(Subject subject) {
        System.out.println(this.displayName + " Updated");
        System.out.println(subject);
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public StatsDisplay(String displayName) {
        this.displayName = displayName;
    }
    

}
