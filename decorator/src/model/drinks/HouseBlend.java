package model.drinks;

import model.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return .89;
    }
}
