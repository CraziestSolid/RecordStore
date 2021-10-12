import javax.swing.JOptionPane;
import java.util.Scanner;



public class RecordStore {

    public static void main(String[] args) {

        /*// create new scanner instance
        Scanner scanner = new Scanner(System.in);

        // Take input from users using scanner and return string based on input
        System.out.println("Enter your login credentials: ");
        String userID = scanner.nextLine();
        System.out.println("Login for " + userID + " successful.");

        System.out.println("How many vinyl records to you want to purchase? ");
        int numberRecords = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have now ordered " + numberRecords + " vinyl records.");

        System.out.println("Enter C to continue, or any other key to log off: ");
        String optionCode = scanner.nextLine();

        // if users enters C then return to records order else show exit dialogue
        if (optionCode.equals("C"))  {
            System.out.println("How many vinyl records to you want to purchase? ");
            int additionalRecords = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Additional " + additionalRecords + " vinyl records are now ordered.");
        }
        else {
            System.out.println("User " + userID + " are now logged off");
        }*/



        String userID = JOptionPane.showInputDialog("Enter your account name:");
        String userPassword = JOptionPane.showInputDialog("Enter your password:");
        JOptionPane.showMessageDialog(null, "Login Successful");

        String numberOfRecords = JOptionPane.showInputDialog("Enter number of records you want to order:");
        JOptionPane.showMessageDialog(null, numberOfRecords + " added to cart");

        String optionCode = JOptionPane.showInputDialog("Enter C to continue? Enter any other key to exit.");
        if(optionCode.equals("C")) {
            String additionalRecords = JOptionPane.showInputDialog("Enter number of records you want to order:");
            JOptionPane.showMessageDialog(null, additionalRecords + " added to cart");
        } else {
            JOptionPane.showMessageDialog(null, "You are now logged off");
        }



    }
}