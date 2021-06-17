package by.itechartgroup.exercises.task40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthyBurgerTest {

    @Test
    void whenHealthyAdditionIsNull_ThenPriceShouldNotRise() {
        HealthyBurger healthyBurger = new HealthyBurger("chicken", 20.0d);
        healthyBurger.addHealthAddition1(null, 0.0d);
        assertEquals(20.0d, healthyBurger.itemizeHamburger());
    }

    @Test
    void whenHealthyAdditionIsPresent_ThenPriceShouldRise() {
        HealthyBurger healthyBurger = new HealthyBurger("chicken", 20.0d);
        healthyBurger.addHealthAddition1("leek", 7.0d);
        assertEquals(27.0d, healthyBurger.itemizeHamburger());
    }

}