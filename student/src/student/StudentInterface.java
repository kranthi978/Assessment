package student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentInterface {
    private Scanner scanner;
    private StudentDetails std;
    private Map<String, StudentDetails> hm;

    public StudentInterface(Scanner scanner) {
        this.scanner = scanner;
        this.hm = new HashMap<String, StudentDetails>();
    }
    
    public void start() {
        while(true) {
            System.out.println("Welcome to MLR Institute Of Technology please select from the options below by pressing the required number");
            System.out.println("1 - Create Student Account");
            System.out.println("2 - Log into Student account");
            System.out.println("3 - Quit");
            System.out.print("Please make a choice: ");
            String input = scanner.nextLine();
            switch(input) {
            case "1": 
                createAccount();
                break;
            case "2":
                login();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
            }       
        }
    }
    
    private void createAccount() {
        
        System.out.println("Please enter your Roll Number");
        String username = scanner.nextLine();
        System.out.println("Please enter a password");
        String password = scanner.nextLine();
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter mobile number:");
        String number = scanner.next();
        
        
        std = new StudentDetails(username, password, name, address, number);
        hm.put(username, std);
        scanner.nextLine();
    }
    
    private void login() {
        System.out.println("Please enter your Roll Number");
        String username = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        
        if(hm.containsKey(username)) {
            std = hm.get(username);
            if(std.getPassword().equals(password)) {
                
                while(true) {
                    System.out.println("Please make a choice");
                    System.out.println("1 - User information");
                    System.out.println("2 - Logout");
                    System.out.print("Please make a choice: ");
                    
                    String choice = scanner.nextLine();
                    switch(choice) {
                    
                    case "1":
                        System.out.println(std);
                        break;
                    case "2":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                            
                    }       
                }
                
                
                
            }
        }
    
    }


}