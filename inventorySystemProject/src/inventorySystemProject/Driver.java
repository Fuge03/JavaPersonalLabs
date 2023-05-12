package inventorySystemProject;

import java.io.IOException;
import java.util.Scanner;

public abstract class Driver
{
	public static void main(String args[]) throws IOException
	{
		Inventory inventory = new Inventory();
		
		/*
		Vegetable carrots = new Vegetable("Carrots", 1.23, 12, true);
		
		Vegetable potatoes = new Vegetable("Potatoes", 1.75, 45, false);
		
		Meat steak = new Meat("Filet Mignon", 20.0, 54, "Prime");
		
		Meat porkFilet = new Meat("Pork Filet", 14.0, 64, "Choice"); 
		
		Meat chickenBreast = new Meat("chicken breast", 12.67, 45,"choice"); 
		
		inventory.addItem(steak);
		
		inventory.addItem(carrots);
		
		inventory.addItem(potatoes);
		
		inventory.addItem(porkFilet);
		
		inventory.addItem(chickenBreast);
		*/
		
		
		//inventory.createFileReport();
		
		inventory.readFromFile("InventoryInput.txt");
		
		inventory.createFileReport();

	}
	
	/*
	public static void main2(String args[])
	{
		
		Inventory inventoryMain = new Inventory();
		
		Scanner keyboard = new Scanner(System.in);		
		
		
		while(true)
		{
			
			System.out.println("Welcome to the grocery store inventory system program"
			+ "\n" + "Enter the number corresponding to the menu option." + "\n" + "1. Enter new item" + "\n" + "2. Change item quantity" + "\n" + "3. Change item price" + "\n" +  "5. Generate inventory report");
					
			
			int inputMenuSelection = keyboard.nextInt();
			
			if (inputMenuSelection == 1)
			{
					System.out.print("To enter new items, enter the item category (Vegetable or Meat): ");
			
					String inputCategory = keyboard.next();
			
					if (inputCategory.equalsIgnoreCase("Vegetable"))
					{
						System.out.println("What is the type of vegetable?: ");
				
						String inputVegetableType = keyboard.next();
				
						System.out.println("What is the price of this vegetable?: ");
				
						double inputVegetablePrice = keyboard.nextDouble();
				
						System.out.println("Organic? (\"true or false\"): ");
				
						boolean inputVegetableOrganicStatus = keyboard.nextBoolean();
				
						System.out.println("What is the quantity being added?: ");
				
						int inputVegetableQuantity = keyboard.nextInt();
				
						Vegetable vegetable = new Vegetable(inputVegetableType, inputVegetablePrice, inputVegetableQuantity, inputVegetableOrganicStatus, "07/23/2023");
				
						inventoryMain.addItem(vegetable);
				
						System.out.println("Item has been added." + "\n");
					}
			
					if (inputCategory.equalsIgnoreCase("Meat"))
					{
						System.out.println("What is the type of meat?: ");
				
						String inputMeatType = keyboard.next();
				
						System.out.println("What is the price of this meat?: ");
				
						double inputMeatPrice = keyboard.nextDouble();
				
						System.out.println("Gradable? (\"USDA choice, USDA prime\"): ");
					
						String inputMeatGrade = keyboard.nextLine();
				
						System.out.println("What is the quantity being added?: ");
				
						int inputMeatQuantity = keyboard.nextInt();
				
						Meat meat = new Meat(inputMeatType, inputMeatPrice, inputMeatQuantity, inputMeatGrade);
				
						inventoryMain.addItem(meat);
				
						System.out.println("Item has been added.");
				
					}
	
			
			}
			
			if (inputMenuSelection == 2)
			{
				System.out.println("Enter the name of the item you want to change the quantity of:");
				
				String inputItemName = keyboard.nextLine();
				
				System.out.println("What is the change in quantity? "+ "\n" + "(Formatting example: enter \"-3\" if you want to remove 3 units of the item. Enter \"3\" if you want to add 3 units of the item)");
				
				int inputQuantityChange = keyboard.nextInt();
				
				inventoryMain.getItem(inputItemName).changeQuantity(inputQuantityChange);
			
				System.out.println("Quantity has been changed");
			}
			
			if (inputMenuSelection == 3)
			{
				System.out.println("Enter the name of the item you want to change the price of:");
				
				String inputItemName = keyboard.nextLine();
				
				System.out.println("What is the new price? ");
				
				int inputNewPrice = keyboard.nextInt();
				
				inventoryMain.getItem(inputItemName).setPrice(inputNewPrice);
			
				System.out.println("Price has been changed");
			}
			
			if (inputMenuSelection == 5)
			{
				System.out.println(inventoryMain.generateInventoryReport());
			}
			
			
		}
	}
	*/
}
