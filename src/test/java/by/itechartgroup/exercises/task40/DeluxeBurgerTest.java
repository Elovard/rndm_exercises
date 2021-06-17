package by.itechartgroup.exercises.task40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeluxeBurgerTest {

    @Test
    void whenAddingAdditionsToDeluxeBurger_ThenPriceShouldRemain19AndMessageShouldShowUp() {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("egg", 10.0d);
        assertEquals(19, deluxeBurger.itemizeHamburger());
    }

}