package io.bryantcason;


import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, String> contacts = new TreeMap<String, String>();

    public void addContact(String name, String number){
        contacts.put(name, number);
    }

    public void removeContact(String name){
        contacts.remove(name);

    }

    public String lookUpContact(String name){
        return contacts.get(name);
    }

    public String reverseLookUp(String number){
        for(String name : contacts.keySet()){
            if(contacts.get(name).equals(number)){
                return name;
            }
        }
        return null;
    }

    public String listAllContacts(){
        String str = "";
        for(Map.Entry<String, String> entry : contacts.entrySet()){
            String name = entry.getKey();
            String number = entry.getValue();

            str += name + ", " + number + ", ";
        }
        System.out.println(str);
        return str;
    }

    public String listAllNames(){
        String str = "";
        for(Map.Entry<String, String> entry : contacts.entrySet()){
            String name = entry.getKey();
            str += name + ", ";
        }
        System.out.println(str);
        return str;
    }
















    /*
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

    public void reverseLookUp(){

    }

    public Person lookUpPerson(String name){
        return personMap.get(name);
    }
*/

}
