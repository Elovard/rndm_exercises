package by.itechartgroup.exercises.task40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburgerTest {

    @Test
    void whenAdditionToBurgerIsNull_ThenPriceShouldNotRise() {
        Hamburger hamburger = new Hamburger("burger", "meat", 15.0d, "white");
        hamburger.addHamburgerAddition1(null, 0.0d);
        assertEquals(15.0d, hamburger.itemizeHamburger());
    }

    @Test
    void whenAdditionToBurgerIsPresent_ThenPriceShouldRise() {
        Hamburger hamburger = new Hamburger("burger", "meat", 15.0d, "white");
        hamburger.addHamburgerAddition1("some addition", 5.0d);
        assertEquals(20.0d, hamburger.itemizeHamburger());
    }

}