package homework3_ChiefCook.dinner;
import homework3_ChiefCook.products.*;

public class Borscht extends Soup {
    public Borscht(double weightMeat, double weightBeet, double weightTomato,  double weightCarrot, double weightBow, double weightPotato) {
        super(new Products[] {new Meat(weightMeat), new Beet(weightBeet),  new Tomato(weightTomato),
                new Carrot(weightCarrot), new Bow(weightBow), new Potatoes(weightPotato)});
        super.setName("Борщ");
    }
}
