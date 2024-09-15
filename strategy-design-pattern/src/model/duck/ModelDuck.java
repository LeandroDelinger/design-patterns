package model.duck;

import model.fly.FlyNoWay;
import model.quack.Squeak;

public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

}
