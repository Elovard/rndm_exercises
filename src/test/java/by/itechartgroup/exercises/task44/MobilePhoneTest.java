package by.itechartgroup.exercises.task44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MobilePhoneTest {

    @Test
    void whenContactIsAlreadyExist_ThenContactShouldNotBeCreated() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        Contact contact1 = new Contact("testName1", "testName2");
        mobilePhone.addContact(contact1);
    }

    @Test
    void whenContactExists_ThenItShouldBeUpdated() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        Contact contact1 = new Contact("James", "123");
        Contact contact2 = new Contact("James", "321");
        assertTrue(mobilePhone.updateContact(contact2, contact1));
    }

    @Test
    void whenContactExists_ThenItShouldBeRemoved() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        Contact contact = new Contact("test", "test");
        mobilePhone.addContact(contact);
        assertTrue(mobilePhone.removeContact(contact));
    }

    @Test
    void whenContactExists_ThenIntShouldBeMoreThanZero() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        Contact contact = new Contact("test", "test");
        assertTrue(mobilePhone.findContact(contact) >= 0);
    }

    @Test
    void whenContactIsNotExist_ThenQueryShouldNotBeDone() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        assertNull(mobilePhone.queryContact("test"));
    }

    @Test
    void whenContactIsNotExistByPosition_ThenQueryShouldNotBeDone() {
        MobilePhone mobilePhone = new MobilePhone("myNumber");
        Contact contact = new Contact("test", "testPhone");
        assertNull(mobilePhone.queryContact(contact));
    }

}