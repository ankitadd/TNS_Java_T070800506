package session_6;

import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter your choice (factorial or circle area): ");
	        String choice = sc.nextLine().toLowerCase();
	        
	        System.out.print("Enter the data value: ");
	        int value = sc.nextInt();
	        
	        Processor processor;
	        
	        switch (choice) {
	            case "factorial":
	                processor = new Factorial();
	                processor.data = value;
	                processor.process();
	                break;
	            case "circle area":
	                processor = new Circle();
	                processor.data = value;
	                processor.process();
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                break;
	        }
	        
	        sc.close();
	    }
	}
