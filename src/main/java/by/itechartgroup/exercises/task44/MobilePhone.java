package by.itechartgroup.exercises.task44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> listOfContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.listOfContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) > 0) {
            return false;
        }
        this.listOfContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            return false;
        }
        this.listOfContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            return false;
        }
        this.listOfContacts.remove(position);
        return true;
    }

    public int findContact(Contact contact) {
        return this.listOfContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            Contact contact = this.listOfContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.listOfContacts.get(position);
        }
        return null;
    }

    public String printContacts() {
        String result = null;
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            result += this.listOfContacts.get(i).getName() + "" + this.listOfContacts.get(i).getPhoneNumber();
        }
        return result;
    }
}
