package dz5;


import java.util.ArrayList;
import java.util.HashMap;

public class task1 {
    private HashMap<String, ArrayList<String>> contacts;

    public task1() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList<String> numbers = contacts.get(name);
            numbers.add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contacts.put(name, numbers);
        }
    }

    public void printContacts() {
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            ArrayList<String> numbers = contacts.get(name);
            for (String number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<String> getNumbers(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            return new ArrayList<String>();
        }
    }

    public static void main(String[] args) {
        task1 phonebook = new task1();
        phonebook.addContact("John Smith", "555-1234");
        phonebook.addContact("John Smith", "555-5678");
        phonebook.addContact("Jane Doe", "555-8765");
        phonebook.addContact("Bob Johnson", "555-4321");

        phonebook.printContacts();
    }
}
