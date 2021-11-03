package student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;
public class StudentInterface {
    private Scanner scanner;
    private StudentDetails std;
    private Map<String, StudentDetails> hm;
    static Map<String,Float> m=new HashMap<>();
    public StudentInterface(Scanner scanner) {
        this.scanner = scanner;
        this.hm = new HashMap<String, StudentDetails>();
    }
    
    public void start() {
        while(true) {
            System.out.println("Welcome to MLR Institute Of Technology please select from the options below by pressing the required number");
            System.out.println("1 - Create Student Account");
            System.out.println("2 - Log into Student account");
            System.out.println("3 - Create Faculty Account");
            System.out.println("4 - login into Faculty Account");
            System.out.println("5 - Quit");
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
            	createFAccount();
            	break;
            case "4":
            	flogin();
            	break;
            case "5":
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
    private void createFAccount() {
        
        System.out.println("Please enter your Faculty_ID");
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
                    System.out.println("1 - Student information");
                    System.out.println("2 - OverAll Marks");
                    System.out.println("3 - Logout");
                    System.out.print("Please make a choice: ");
                    
                    String choice = scanner.nextLine();
                    switch(choice) {
                    
                    case "1":
                        System.out.println(std);
                        break;
                    case "2":
                    	float avg=0;
                    	for(Entry<String, Float> e: m.entrySet())
                    	{
                    		System.out.println(e.getKey() +" "+ e.getValue());
                    		avg=avg+e.getValue();
                    		avg=avg/4;
                    		System.out.println("OverAll CGPA :"+avg);
                    	}
                    	break;
                    case "3":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                            
                    }       
                }
                
                
                
            }
        }
    
    }
    private void flogin() {
        System.out.println("Please enter Faculty_ID");
        String username = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        
        if(hm.containsKey(username)) {
            std = hm.get(username);
            if(std.getPassword().equals(password)) {
                
                while(true) {
                	int flag=0;
                    System.out.println("Please make a choice");
                    System.out.println("1 - Enter student sgpa");
                    System.out.println("2 - Logout");
                    System.out.print("Please make a choice: ");
                    
                    String choice = scanner.nextLine();
                    switch(choice) {
                    
                    case "1":
                        System.out.println("Enter 1st SEM SGPA: ");
                        float f=scanner.nextFloat();
                        m.put("1st sem SGPA", f);
                        System.out.println("Enter 2st SEM SGPA: ");
                        float f1=scanner.nextFloat();
                        m.put("2st sem SGPA", f1);
                        System.out.println("Enter 3st SEM SGPA: ");
                        float f3=scanner.nextFloat();
                        m.put("3st sem SGPA", f3);
                        System.out.println("Enter 4st SEM SGPA: ");
                        float f4=scanner.nextFloat();
                        m.put("4st sem SGPA", f4);
                        
                        break;
                    case "2":
                        flag=1;
                        break;
                    default:
                        System.out.println("Invalid option");
                            
                    }  
                    if(flag==1)
                    	
                    {
                    	break;
                    }
                }
                
                
                
            }
        }
    
    }


}