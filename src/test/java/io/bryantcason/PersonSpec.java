package io.bryantcason;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonSpec {

    @Test
    public void nameTest(){
        Person person = new Person("Jet Li");

        String expectedName = "Jet Li";
        String actualName = person.getName();
        assertEquals("The expected name should be Jet Li", expectedName, actualName);
    }

    @Test
    public void addPhoneNumberTest(){
        Person person = new Person("Jet Li");

        person.addPhoneNumber("555.555.5555");
        int expectedPhoneNumber = 1;
        int actualPhoneNumber = person.getNumberOfPhoneNumbers();
        assertEquals("The expect phone number should be added", expectedPhoneNumber, actualPhoneNumber);
    }

    @Test
    public void removePhoneNumberTest(){
        Person person = new Person("Jet Li");

        person.addPhoneNumber("555.545.5555");
        person.removePhoneNumber(1);
        int expectedNumberOfPhoneNumbers = 0;
        int actualNumberOfPhoneNumbers = person.getNumberOfPhoneNumbers();
        assertEquals("The phone should be removed", expectedNumberOfPhoneNumbers, actualNumberOfPhoneNumbers);
    }

}
