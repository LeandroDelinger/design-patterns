package model.drinks;

import model.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        setDescription("Expresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
