package io.bryantcason;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookSpec {

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

}
