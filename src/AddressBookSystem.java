import java.util.HashMap;

public class AddressBookSystem {
     HashMap<String, AddressBook> addressBooks;

    // Constructor
    public AddressBookSystem() {
        addressBooks = new HashMap<>();
    }

    // Add a new address book to the system
    public void addAddressBook(String name) {
        AddressBook newAddressBook = new AddressBook();
        addressBooks.put(name, newAddressBook);
        System.out.println("Address Book '" + name + "' added to the system.");
    }

    // Get an address book by name
    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
}
