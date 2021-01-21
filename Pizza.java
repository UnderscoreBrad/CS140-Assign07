package assignment07;

interface Pizza extends Comparable<Pizza> {

    String getDescription();

    default double getCost(){
        return 0.0;
    }

    int compareTo(Pizza p);

}

