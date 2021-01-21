package assignment07;

public class LargeSheetPizza implements Pizza {

    public String getDescription(){
        return "Large sheet pizza";
    }
    public double getCost(){
        return 15.0;
    }
    public int compareTo(Pizza p){
        return 1;
    }

}
