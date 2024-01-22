import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    /* UC4:-Ability to delete a person using person's name - Use Console to delete a person*/
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
    // Find a contact by name
    public Contact findContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null; // Contact not found
    }

    // Edit details of an existing contact

    public void editContactDetails(String firstName, String lastName,Scanner scanner)
    {
        Contact contactToEdit = findContactByName(firstName,lastName);

        if (contactToEdit != null) {
            System.out.println("Enter new information for contact:");
            System.out.print("Address: ");
            contactToEdit.setAddress(scanner.nextLine());
            System.out.print("City: ");
            contactToEdit.setCity(scanner.nextLine());
            System.out.print("State: ");
            contactToEdit.setState(scanner.nextLine());
            System.out.print("ZIP Code: ");
            contactToEdit.setZip(scanner.nextLine());
            System.out.print("Phone Number: ");
            contactToEdit.setPhoneNumber(scanner.nextLine());
            System.out.print("Email: ");
            contactToEdit.setEmail(scanner.nextLine());
            System.out.println("Contact details updated successfully.");
        } else {
            System.out.println("Contact not found. No changes made.");
        }
    }
    // Delete an existing contact
    public void deleteContact(String firstName, String lastName) {
        Contact contactToDelete = findContactByName(firstName, lastName);

        if (contactToDelete != null) {
            contacts.remove(contactToDelete);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found. No changes made.");
        }
    }
}



