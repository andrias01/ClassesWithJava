package com.andresVelez.ContactBook.app;

import com.andresVelez.ContactBook.domain.Contact;
import com.andresVelez.ContactBook.domain.ContactBook;

public class ContactBookApp {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook("Friends");

        contactBook.createContact("Andres","Velez",305747783);
        contactBook.createContact("Simon","Castellanos",301602554);
        contactBook.createContact("Steven","Ochoa",456789221);
        contactBook.createContact("Cristian","Marin",789563278);
        contactBook.createContact("Juan","Ruiz",857416397);

        contactBook.getContacts();

        contactBook.delateContact("Cristian");

        contactBook.getContacts();

        contactBook.findContactByName("Simon");

        contactBook.findContactByLastName("Velez");

        contactBook.findContactByCellphoneNumber(456789221);

        contactBook.changeContactNumber("Juan",123456789);

        contactBook.getContacts();

        contactBook.orderContactsByNameAndLastName();

        contactBook.getContacts();

        /*  Una forma de crearlos pero hay que utilizar los metodos del ContactBook
        Contact contact1 = new Contact("Andres","Velez",305747783);
        Contact contact2 = new Contact("Simon","Castellanos",301602554);
        Contact contact3 = new Contact("Steven","Ochoa",456789221);
        Contact contact4 = new Contact("Cristian","Marin",789563278);
        Contact contact5 = new Contact("juan","Ruiz",857416397);
        contactBook.getContacts().add(contact1);
        contactBook.getContacts().add(contact2);
        contactBook.getContacts().add(contact3);
        contactBook.getContacts().add(contact4);
        contactBook.getContacts().add(contact5);
         */
    }
}
