package assignment07;

public class GoatCheese extends PizzaTopping {

    public GoatCheese(Pizza on){
        super(on);
    }

    public double getCost(){
        return 0.30 + getOn().getCost();
    }
}
