import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Contact {



    public static void contactApp() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean goAgain = true;
        do{
        System.out.println("What action do you want to perform? \n" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        String userInput = scanner.nextLine();
        if(userInput.equals("1")) {
            System.out.println("Here are your current contacts. ");
            viewAllContact();
            System.out.println(" ");
        }
        else if (userInput.equals("2")){
            addNewContact();
        }
        else if (userInput.equals("3")){
            searchContact();
        }
        else if (userInput.equals("4")){
            deleteContact();
        }
        else if (userInput.equals("5")){
            System.out.println("Goodbye");
        } if (userInput.equals("5")){
                goAgain = false;
            }
        }while(goAgain);
    }
    private static String directory = "data";
    private static String filename = "contactList.txt";
    private static Path dataDirectory = Paths.get(directory,filename);

    private static void  viewAllContact() throws IOException {
        List<String> List = Files.readAllLines(dataDirectory);
        for (int i = 0; i < List.size(); i += 1) {
            System.out.println((i + 1) + ": " + List.get(i));
        }
    }

    private static String deleteContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which contact would you like to delete. ");
        return scanner.nextLine();
    }

    private static String searchContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter contact name to lookup. ");
        return scanner.nextLine();
    }

    private static void addNewContact() throws IOException {
        String firstName = addFirstName();
        String lastName = addLastName();
        String phoneNumber = addPhoneNumber();
        String newContactInfo = firstName +" "+ lastName+" "+ phoneNumber;
        Files.write(
                Paths.get("data", "contactList.txt"),
                Collections.singletonList(newContactInfo), // list with one item
                StandardOpenOption.APPEND
        );
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
