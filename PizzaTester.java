package assignment07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTester {


    @Test
    void testMediumWithToppings() {
        Pizza p = new Pepperoni(new ExtraCheese(new Mushroom(new MediumCheesePizza())));
        assertEquals(10.8, p.getCost(), 0.0000001);
    }

    @Test
    void testSmallWithToppings() {
        Pizza p = new Pepperoni(new ExtraCheese(new Mushroom(new GoatCheese(new SmallCheesePizza()))));
        assertEquals(9.1, p.getCost(), 0.0000001);
    }
}