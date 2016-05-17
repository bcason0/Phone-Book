package io.bryantcason;


import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, Person> personMap;

    public PhoneBook(){
        personMap = new TreeMap<String, Person>();
    }

    public void addPerson(String name, Person person){
        personMap.put(name, person);
    }

    public void removePerson(String name){
        personMap.remove(name);
    }

    public Person lookUpPerson(String name){
        return personMap.get(name);
    }

}
