import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    /* UC2:- Ability to add a new
Contact to Address Book.*/
    // Create List of Contacts
    List<Contact> contacts;

        // Constructor
        public AddressBook() {
            contacts = new ArrayList<>();
        }

        // Add a contact to the address book
        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        // Display all contacts in the address book
        public void displayContacts() {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

