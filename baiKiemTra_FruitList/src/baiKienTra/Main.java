package baiKienTra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager fruitManager = new Manager();
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
		System.out.println("---------- FRUIT MANAGER----------");
		
		System.out.println("1. Add a fruit");
		System.out.println("2. Remove a fruit");
		System.out.println("3. Update fruit");
		System.out.println("4.Display on fruit");
		System.out.println("5.Sort fruit");
		System.out.println("0. EXIT");
		System.out.println("--> ENTER YOUR CHOICE : ");
		choice = sc.nextInt();
        sc.nextLine();
        
	switch (choice) {
	case 1: 
		 System.out.println("Enter your Name fruit : ");
		 String Name = sc.nextLine();
		 System.out.println("Enter your Weight fruit : ");
		 Double Weight = sc.nextDouble();
		 sc.nextLine();
		 System.out.println("Enter your Price fruit : ");
		 Double Price = sc.nextDouble();
		 sc.nextLine();
		 
		 Fruit fruit = new Fruit(Name, Weight, Price);
         fruitManager.add(fruit);
         System.out.println("Fruit added successfully!");
         break;
	case 2:
	    System.out.print("Enter the name of the fruit to remove: ");
	    String fruitName = sc.nextLine();
	    boolean fruitFound = false;
	    Fruit fruitToRemove = null;
	    
	    for (Fruit f : fruitManager.getAll()) {
	        if (f.getName().equalsIgnoreCase(fruitName)) {
	            fruitToRemove = f;
	            fruitFound = true;
	            break;
	        }
	    }
	    
	    if (fruitFound) {
	        fruitManager.removeFruit(fruitToRemove);
	        System.out.println("Fruit removed successfully!");
	    } else {
	        System.out.println("Fruit not found!");
	    }
	    
	    break;
		    
	case 3:
		 System.out.print("Enter the name of the fruit to update: ");
		    String fruitNames = sc.nextLine();
		    boolean fruitFounds = false;
		    
		    for (Fruit f : fruitManager.getAll()) {
		        if (f.getName().equalsIgnoreCase(fruitNames)) {
		            System.out.print("Enter the new name: ");
		            String newName = sc.nextLine();
		            
		            
		            System.out.print("Enter the new weight: ");
		            Double newWeight= sc.nextDouble();
		            
		            System.out.print("Enter the new price: ");
		            double newPrice = sc.nextDouble();
		            sc.nextLine();
		            
		            fruitManager.updateFruit(f, newName, newWeight, newPrice);
		            fruitFound = true;
		            break;
		        }
		    }
		    
		    if (!fruitFounds) {
		        System.out.println("Fruit not found!");
		    }
		    
		    break;
	 case 4:
         System.out.println("All fruits:");
         for (Fruit f : fruitManager.getAll()) {
             System.out.println(f);
         }
         break;
     case 5:
         fruitManager.sort();
         System.out.println("Fruits sorted successfully!");
         break;
     case 0:
         System.out.println("Exiting...");
         break;
     default:
         System.out.println("Invalid choice! Please try again.");
         break;
 }
		} while (choice != 0);

		sc.close();
}
}
	
	
		

    


