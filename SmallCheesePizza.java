package assignment07;

public class SmallCheesePizza implements Pizza{

    public String getDescription(){
        return "Small cheese pizza";
    }
    public double getCost(){
        return 8.0;
    }
    public int compareTo(Pizza p){
        return 1;
    }

}
