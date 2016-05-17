package io.bryantcason;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, ArrayList<String>> contacts = new TreeMap<String, ArrayList<String>>();

    public void addContact(String name, ArrayList<String> number){
        contacts.put(name, number);
    }

    public void removeContact(String name){
        contacts.remove(name);

    }

    public ArrayList<String> lookUpContact(String name){
        return contacts.get(name);
    }

    public String reverseLookUp(String number){
        for(String name : contacts.keySet()){
            if(contacts.get(name).contains(number)){
                return name;
            }
        }
        return null;
    }

    public String listAllContacts(){
        String str = "";
        for(Map.Entry<String, ArrayList<String>> entry : contacts.entrySet()){
            String name = entry.getKey();
            ArrayList<String> number = entry.getValue();

            str += name + ", " + number + ", ";
        }
        System.out.println(str);
        return str;
    }

    public String listAllNames(){
        String str = "";
        for(Map.Entry<String, ArrayList<String>> entry : contacts.entrySet()){
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
