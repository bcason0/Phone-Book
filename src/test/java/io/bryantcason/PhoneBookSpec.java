package io.bryantcason;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookSpec {

    PhoneBook newarkPhoneBook;

    @Before
    public void init() {
        newarkPhoneBook = new PhoneBook();
        newarkPhoneBook.addContact("Jet Li", "555.555.5555");
        newarkPhoneBook.addContact("Jackie Chan", "4953");
        newarkPhoneBook.addContact("Bruce Lee", "02542");
    }

    @Test
    public void lookUpContactTest(){
        String expectedValue = "555.555.5555";
        String actualValue = newarkPhoneBook.lookUpContact("Jet Li");
        assertEquals("Show the number for Jet Li", expectedValue, actualValue);
    }

    @Test
    public void listAllNamesTest(){
        String expectedValue = "Bruce Lee, Jackie Chan, Jet Li, ";
        String actualValue = newarkPhoneBook.listAllNames();
        assertEquals("Should list all names", expectedValue, actualValue);
    }

    @Test
    public void listAllContactsTest(){
        String expectedValue = "Bruce Lee, 02542, Jackie Chan, 4953, Jet Li, 555.555.5555, ";
        String actualValue = newarkPhoneBook.listAllContacts();
        assertEquals("Names and numbers should show", expectedValue, actualValue);
    }

    @Test
    public void removeContacts(){
        newarkPhoneBook.removeContact("Jet Li");
        String actualValue = newarkPhoneBook.lookUpContact("Jet Li");
        assertNull("Should return null", actualValue);
        newarkPhoneBook.listAllContacts();
    }



















    /*
    @Test
    public void addPersonTest(){
        PhoneBook newarkPhoneBook = new PhoneBook();
        String expectedPersonName = "Jet Li";
        Person person = new Person(expectedPersonName);
        newarkPhoneBook.addPerson(expectedPersonName, person);
        String actualPersonName = newarkPhoneBook.lookUpPerson(expectedPersonName).getName();
        assertTrue("The expected name should equal the actual name,", expectedPersonName.equals(actualPersonName));
    }
    @Test
    public void removePersonTest(){
        PhoneBook newarkPhoneBook = new PhoneBook();
        newarkPhoneBook.addPerson("Jet Li", new Person("Jet Li"));
        newarkPhoneBook.removePerson("Jet Li");
        String expectedValue = null;
        Person actualValue = newarkPhoneBook.lookUpPerson("Jet Li");
        assertEquals("Test to see if Person is removed", expectedValue, actualValue);
    }

    @Test
    public void lookUpPersonTest(){
        PhoneBook newarkPhoneBook = new PhoneBook();
        newarkPhoneBook.addPerson("Jet Li", new Person("Jet Li"));
        String expectedPerson = new Person("Jet Li").getName();
        String actualPerson = newarkPhoneBook.lookUpPerson("Jet Li").getName();
        assertEquals("This test looks up Jet li",expectedPerson,actualPerson);
    }
*/
}
