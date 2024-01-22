import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        // Constructor
        public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // Getters
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString()  //tostring method represents object as a string.
        {
            return "Name: " + firstName + " " + lastName +
                    "\nAddress: " + address +
                    "\nCity: " + city +
                    "\nState: " + state +
                    "\nZIP: " + zip +
                    "\nPhone Number: " + phoneNumber +
                    "\nEmail: " + email + "\n";
        }
    }

