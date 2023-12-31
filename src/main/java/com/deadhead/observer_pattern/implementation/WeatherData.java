package com.deadhead.observer_pattern.implementation;

import java.util.ArrayList;
import java.util.List;
import com.deadhead.observer_pattern.specifications.Observer;
import com.deadhead.observer_pattern.specifications.Subject;

public class WeatherData implements Subject {

    private List<Observer> displays;
    private Double temperature;
    private Double airPressure;
    private Double humidity;

    @Override
    public void registerObserver(Observer display) {
        this.displays.add(display);
    }

    @Override
    public void removeObserver(Observer display) {
        this.displays.remove(display);
    }

    @Override
    public void notifyObservers(Subject subject) {
        this.displays.stream().forEach((display) -> {
            display.update(subject);
        });
    }

    public WeatherData() {
        this.displays = new ArrayList<Observer>();
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notifyObservers(this);
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
        notifyObservers(this);
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
        notifyObservers(this);
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public Double getAirPressure() {
        return this.airPressure;
    }

    public Double getHumidity() {
        return this.humidity;
    }

    @Override
    public String toString() {
        return "WeatherData [temperature=" + temperature + ", airPressure=" + airPressure + ", humidity=" + humidity
                + "]";
    }

}
