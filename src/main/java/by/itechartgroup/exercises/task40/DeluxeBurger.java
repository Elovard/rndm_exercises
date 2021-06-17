package by.itechartgroup.exercises.task40;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 15.0, "White");
        super.addHamburgerAddition1("Chips", 2.50);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }
}
