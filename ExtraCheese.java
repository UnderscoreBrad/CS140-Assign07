package assignment07;

public class ExtraCheese extends PizzaTopping {

    public ExtraCheese(Pizza on){
        super(on);
    }

    public double getCost(){
        return 0.15 + getOn().getCost();
    }
}
