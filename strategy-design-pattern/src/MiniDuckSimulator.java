import model.duck.Duck;
import model.duck.MallardDuck;
import model.duck.ModelDuck;
import model.fly.FlyRocketPowered;
import model.quack.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.performQuack();


        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        //example of setting flyBehavior and quackBehavior in execution time
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

    }
}