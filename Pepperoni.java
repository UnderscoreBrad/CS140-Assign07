package assignment07;

public class Pepperoni extends PizzaTopping {

    public Pepperoni(Pizza on){
        super(on);
    }

    public double getCost(){
        return 0.40 + getOn().getCost();
    }
}
