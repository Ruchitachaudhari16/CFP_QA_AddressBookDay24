import java.util.Scanner;

public class AddressBookMain {
    /*UC5:- Ability to add multiple person to Address Book
- Use Console to add person details one at a time
- Use Collection Class to maintain multiple
contact persons in Address Book*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            AddressBook addressBook = new AddressBook();

            // User Input for a contact
            System.out.println("Welcome to AddressBook");
            System.out.println("contact information:");
            System.out.print("Enter First Name:- ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name:- ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address:- ");
            String address = scanner.nextLine();
            System.out.print("Enter City:- ");
            String city = scanner.nextLine();
            System.out.print("Enter State:- ");
            String state = scanner.nextLine();
            System.out.print("Enter ZIP Code:- ");
            String zip = scanner.nextLine();
            System.out.print("Enter Phone Number:- ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email:- ");
            String email = scanner.nextLine();

            // Create a new contact
            Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

            // Add the contact to the address book
            addressBook.addContact(newContact);

            // Display all contacts in the address book
            System.out.println("\nAddress Book:");
            addressBook.displayContacts();

            // Edit existing contact using console
            System.out.println("\nEnter the name of the contact you want to edit:");
            System.out.print("First Name: ");
            String editFirstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String editLastName = scanner.nextLine();

            addressBook.editContactDetails(editFirstName, editLastName, scanner);

            // Display all contacts in the address book after editing
            System.out.println("\nUpdated Address Book:");
            addressBook.displayContacts();

            // Delete existing contact using console
            System.out.println("\nEnter the name of the contact you want to delete:");
            System.out.print("First Name: ");
            String deleteFirstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String deleteLastName = scanner.nextLine();

            addressBook.deleteContact(deleteFirstName, deleteLastName);

            // Display all contacts in the address book after deletion
            System.out.println("\nUpdated Address Book:");
            addressBook.displayContacts();

            // Collect information for multiple contacts using console
            char addAnother;

            do {
                // Collect information for a contact using console
                System.out.println("Enter contact information:");
                System.out.print("First Name: ");
                firstName = scanner.nextLine();
                System.out.print("Last Name: ");
                lastName = scanner.nextLine();
                System.out.print("Address: ");
                address = scanner.nextLine();
                System.out.print("City: ");
                 city = scanner.nextLine();
                System.out.print("State: ");
                state = scanner.nextLine();
                System.out.print("ZIP Code: ");
               zip = scanner.nextLine();
                System.out.print("Phone Number: ");
                 phoneNumber = scanner.nextLine();
                System.out.print("Email: ");
               email = scanner.nextLine();

                // Create a new contact
                Contact newContactOne= new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

                // Add the contact to the address book
                addressBook.addContact(newContact);

                System.out.print("Do you want to add another contact? (y/n): ");
                addAnother = scanner.nextLine().charAt(0);
            } while (addAnother == 'y' || addAnother == 'Y');

            // Display all contacts in the address book
            System.out.println("\nAddress Book:");
            addressBook.displayContacts();

            scanner.close();
        }
}

