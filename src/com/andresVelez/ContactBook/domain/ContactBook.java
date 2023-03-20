package com.andresVelez.ContactBook.domain;

import com.andresVelez.mall.domain.Store;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContactBook {
    public static final byte maxContacts = 50;
    private String name;
    private List<Contact> contacts;

    public ContactBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public boolean createContact(String ContactName,String contactLastName,long contactCellphoneNumber){
        Contact contact = this.findContactByCellphoneNumber(contactCellphoneNumber);

        if (this.contacts.size() < maxContacts && contact == null) {
            Contact contactToAdd = new Contact(ContactName, contactLastName,contactCellphoneNumber);
            this.contacts.add(contactToAdd);
            return true;
        }
        return false;
    }

    public void delateContact(String ContactName) {
        Contact contact = this.findContactByName(ContactName);

        if (contact != null) {
            this.contacts.remove(contact);
            System.out.println("The contact name '" + ContactName + "' was removed!!.");
        } else {
            System.out.println("The contact name '" + ContactName + "' doesnt exist.");
        }
    }

    public Contact findContactByName(String contactName) {
        Contact contactToReturn = null;

        for (Contact contact : this.contacts) {
            if (contact.getName() == contactName) {
                contactToReturn = contact;
                System.out.println("The contact was found and their data is:");
                System.out.println("Name: "+contact.getName()+" LastName: "+contact.getLastName()+" CellphoneNumber: "+contact.getCellphoneNumber());
                break;
            }
        }
        return contactToReturn;
    }

    public Contact findContactByLastName(String contactLastName) {
        Contact contactToReturn = null;

        for (Contact contact : this.contacts) {
            if (contact.getLastName() == contactLastName) {
                contactToReturn = contact;
                System.out.println("The contact was found and their data is:");
                System.out.println("Name: "+contact.getName()+" LastName: "+contact.getLastName()+" CellphoneNumber: "+contact.getCellphoneNumber());
                break;
            }
        }
        return contactToReturn;
    }

    public Contact findContactByCellphoneNumber(long contactCellphoneNumber) {
        Contact contactToReturn = null;

        for (Contact contact : this.contacts) {
            if (contact.getCellphoneNumber() == contactCellphoneNumber) {
                contactToReturn = contact;
                System.out.println("The contact was found and their data is:");
                System.out.println("Name: "+contact.getName()+" LastName: "+contact.getLastName()+" CellphoneNumber: "+contact.getCellphoneNumber());
                break;
            }
        }
        return contactToReturn;
    }

    public Contact changeContactNumber(String ContactName,long newCellphoneNumber){
        Contact contactToReturn = null;

        for (Contact contact : this.contacts) {
            if (contact.getName() == ContactName) {
                contact.setCellphoneNumber(newCellphoneNumber);
                contactToReturn = contact;
                System.out.println("The cellphoneNumber of "+contact.getName()+" was changed successfully !!!!");
                break;
            }
        }
        return contactToReturn;
    }

    public void orderContactsByNameAndLastName() {
        this.contacts.sort(Comparator.comparing(Contact::getName).thenComparing(Contact::getLastName));
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        System.out.println("\nCurrent ContactBook");
        for (Contact contact : this.contacts) {
            System.out.println("Name: "+contact.getName()+" LastName: "+contact.getLastName()+" CellphoneNumber: "+contact.getCellphoneNumber());
        }
        System.out.println("\n");
        return this.contacts;
    }
}
