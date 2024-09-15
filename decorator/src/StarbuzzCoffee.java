import model.Beverage;
import model.condiments.Mocha;
import model.condiments.Soy;
import model.condiments.Whip;
import model.drinks.Expresso;
import model.drinks.HouseBlend;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription() + " $" + expresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}