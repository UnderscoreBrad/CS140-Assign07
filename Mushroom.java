package assignment07;

public class Mushroom extends PizzaTopping {

    public Mushroom(Pizza on){
        super(on);
    }

    public double getCost(){
        return 0.25 + getOn().getCost();
    }
}
