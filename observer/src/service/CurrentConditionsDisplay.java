package service;

import model.DisplayElement;
import model.Observer;
import model.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject wheaterData;

    public CurrentConditionsDisplay(Subject wheaterData) {
        this.wheaterData = wheaterData;
        wheaterData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics conditions display: " + temperature +"F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
}
