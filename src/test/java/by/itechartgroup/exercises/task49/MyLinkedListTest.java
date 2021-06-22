package by.itechartgroup.exercises.task49;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyLinkedListTest {

    @Test
    void whenNodeIsNotNull_ThenResultShouldBeTrue() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        ListItem testItem = new Node("15");
        assertTrue(myLinkedList.addItem(testItem));
    }

    @Test
    void whenObjectIsPresent_ThenRemoveShouldBeDone() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        ListItem testItem = new Node("15");
        myLinkedList.addItem(testItem);
        assertTrue(myLinkedList.removeItem(testItem));
    }

}