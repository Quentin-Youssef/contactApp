import java.util.Scanner;

public class Contact {

    public static void contactApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What action do you want to perform? \n" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        String userInput = scanner.nextLine();
        if(userInput.equals("2")){
            addNewContact();
        }
    }

    private static void addNewContact() {
        String firstName = addFirstName();
        String lastName = addLastName();
        String phoneNumber = addPhoneNumber();
    }

        private static String addFirstName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name for the contact info. ");
            return scanner.nextLine().toLowerCase();
    }
    private static String addLastName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last name for the contact info. ");
        return scanner.nextLine().toLowerCase();
    }
    private static String addPhoneNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number for the contact info. ");
        return scanner.nextLine().toLowerCase();
    }
}
