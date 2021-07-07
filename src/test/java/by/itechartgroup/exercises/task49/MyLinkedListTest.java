package by.itechartgroup.exercises.task49;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyLinkedListTest {

    @Test
    void whenNodeIsNotNull_ThenResultShouldBeTrue() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        ListItem testItem = new Node("15");
        assertTrue(myLinkedList.addItem(testItem));
    }

    @Test
    void whenNodesAreNotNull_ThenRightLinkShouldContainNextObject() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        node1.setNext(node2);
        node2.setNext(node3);
        assertTrue(node1.rightLink == node2);
        assertTrue(node2.rightLink == node3);
    }

    @Test
    void whenNodesAreNotNull_ThenLeftLinkShouldContainPreviousObject() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        node3.setPrevious(node2);
        node2.setPrevious(node1);
        assertTrue(node3.leftLink == node2);
        assertTrue(node2.leftLink == node1);
    }

    @Test
    void whenNextNodeIsNull_ThenResultShouldBeTrue() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        assertNull(node3.next());
    }

    @Test
    void whenPreviousNodeIsNull_ThenResultShouldBeTrue() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        assertNull(node1.previous());
    }

    @Test
    void whenObjectIsPresent_ThenRemoveShouldBeDone() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        ListItem testItem = new Node("15");
        myLinkedList.addItem(testItem);
        assertTrue(myLinkedList.removeItem(testItem));
    }

    @Test
    void whenListIsEmpty_ThenMessageShouldAppear() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(null);
    }

    @Test
    void whenListIsNotEmpty_ThenValueOfNodesShouldAppear() {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        Node node1 = new Node("10");
        Node node2 = new Node("15");
        Node node3 = new Node("20");
        myLinkedList.addItem(node1);
        myLinkedList.addItem(node2);
        myLinkedList.addItem(node3);
        myLinkedList.traverse(node1);
    }

}