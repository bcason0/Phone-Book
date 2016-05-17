package io.bryantcason;
import java.util.List;

public class Person {
    private String name;
    List<String> phoneNumbers;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addPhoneNumber(String newPhoneNumber){
        phoneNumbers.add(newPhoneNumber);
    }

    public void removePhoneNumber(int index){
        phoneNumbers.get(index-1);
    }

    public int getNumberOfPhoneNumbers(){
        return phoneNumbers.size();
    }
}


