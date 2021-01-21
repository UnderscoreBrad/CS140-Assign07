package assignment07;

abstract class PizzaTopping implements Pizza {
    private Pizza on;

    public PizzaTopping(Pizza on){
        this.on = on;
    }
    public String getDescription(){
        String rtn = getClass().getSimpleName();
        if(on instanceof PizzaTopping){
            rtn += ", " + on.getDescription();
        }else{
            rtn += " on " + on.getDescription();
        }
        return rtn.substring(0,1).toUpperCase() + rtn.substring(1).toLowerCase();
    }
    public Pizza getOn(){
        return on;
    }

    public void setOn(Pizza on){
        this.on = on;
    }

    public int compareTo(Pizza p) {
        if (p instanceof PizzaTopping) {
            return getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
        }else{
            return -1;
        }
    }
}
