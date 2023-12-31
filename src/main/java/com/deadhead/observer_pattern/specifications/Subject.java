package com.deadhead.observer_pattern.specifications;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Subject subject);
}
