package inventorySystemProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lead Author(s):
 * @author Victor Fugere; 5550075609
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * Mr. Allan Schougaard
 * 
 * References:
 * 
 * 
 * <<add more references here>>
 *  
 * Version/date: 05/12/2023
 * 
 * Responsibilities of class: Manages the inventory of the grocery store. Input and output of stock.
 * 
 */

public class Inventory 
{
	//Inventory has many items
	private Item[][] items;
	
	/**
	 * Pupose: Constructor method for creating an inventory object
	 */
	public Inventory()
	{
		//items are stored in a 2D array of items
		items = new Item[6][6];
	}
	
	
	/**
	 * Purpose: Adds item to the inventory
	 * @param item to be added
	 */
	public void addItem(Item item)
	{
		//Allows the program to exit the loop once the item has found an empty space in the array
		boolean itemAdded = false;
		
		//Goes through inventory
		for (int rowCounter = 0; rowCounter < items.length; rowCounter++)
		{
			//Another for loop since this is a 2D array
			for (int columnCounter = 0; columnCounter < items[rowCounter].length; columnCounter++)
			{
				//Checks to see if this index is empty and item hasn't been already placed
				if (items[rowCounter][columnCounter] == null && itemAdded == false)
				{
					//If it is, the item is add at that index
					items[rowCounter][columnCounter] = item;
					//Item has now been added	
					itemAdded = true;
				}
			}
		}
	}
	
	
	/**
	 * Purpose: Goes through the inventory and turns item information into a String
	 * @return the inventory report
	 */
	public String generateInventoryReport()
	{
		//inventoryReport will hold the string
		String inventoryReport = "";
		//Goes through inventory
		for (int rowCounter = 0; rowCounter < items.length; rowCounter++)
		{
			//Since this is a 2D array, we need to for loops to go through it
			for (int columnCounter = 0; columnCounter < items[rowCounter].length; columnCounter++)
			//Checks if there is an item stored at that index
			if (items[rowCounter][columnCounter] != null)
			{
				//Adds string about item to the inventory report string
				inventoryReport += items[rowCounter][columnCounter].toString() + "\n";
			}
		}
		//Returns the inventory report string
		return inventoryReport;
	}
	
	/**
	 * Purpose: Gets item for the different operations that can be done.
	 * @param item name
	 * @return 
	 */
	public Item getItem(String itemName)
	{
		//Goes through inventory
		for (int rowCounter = 0; rowCounter < items.length; rowCounter++)
		{
			//Another for loop since this is a 2D array
			for (int columnCounter = 0; columnCounter < items[rowCounter].length; columnCounter++)
			//Checks to see if this is the item we are looking for
			if (items[rowCounter][columnCounter] != null && items[rowCounter][columnCounter].getItemName().equals(itemName))
			{
				//If it is, the item is returned
				return items[rowCounter][columnCounter];
			}
		}
		//Returns null if item does not exist
		return null;
	}
	
	/**
	 * Purpose: Creates a report of the inventory and writes it to a text file
	 */
	public void createFileReport()
	{	
		//Writer object will allow us to write to the file
		Writer fileWriter = null;
		//Try-catch-finally statement for exception handling
		try
		{
			//Assigning the Writer variable to a FileWriter object and passing it the file name
			fileWriter = new FileWriter("InventoryReport.txt");
			//Writes inventory report to the file utilizing the generateInventoryReport method
			fileWriter.write(generateInventoryReport());
		}
		//Catches exception and prints throwable
		catch (IOException e)
		{
			//Prints exception
			e.printStackTrace();
		}
		finally
		{
			//Tries to close fileWriter
			try
			{
				if (fileWriter != null)
				{
					fileWriter.close();
				}
			}
			//Catches exception if let's say if fileWriter was null
			catch (IOException e)
			{
				//Prints exception
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * Purpose: Reads inventory from text file and creates item objects from this report
	 * @param fileName
	 */
	public void readFromFile(String fileName)
	{
		//Scanner will allow us to go through text file and read the info
		Scanner scanner = null;
		//String ArrayList to store each line text to a new index
		ArrayList<String> input = new ArrayList<>();
		//Will allow us to access file
		File file = new File(fileName);
		//try-catch-finally statement for exception handling
		try
		{
			//Assigns scanner with new scanner object and passes it the file
			scanner = new Scanner(file);
			//Continues reading from file as long as there is still information to be read
			while (scanner.hasNextLine())
			{
				//Adds new line of text to a new index in the arraylist
				input.add(scanner.nextLine());
			}
			//Goes through arraylist to extract information for the creation of the item objects
			for (int i = 0; i < input.size(); i++)
			{				
				//Uses the keyword "grade" to know if the new object will be of class meat
				if (input.get(i).contains("Grade"))
				{
					//Extracts item name from text line by using substring and the index of these keywords
					String itemName = input.get(i).substring(input.get(i).indexOf("Item name: ") + 11, input.get(i).indexOf("Price:") - 1);
					//Extracts item price from text line by using substring and the index of these keywords. Held as a string for now
					String itemPriceString = input.get(i).substring(input.get(i).indexOf("Price: ") + 7, input.get(i).indexOf("	Quantity:"));
					//Extracts item quantity from text line by using substring and the index of these keywords. Held as a string for now
					String itemQuantityString = input.get(i).substring(input.get(i).indexOf("Quantity: ") + 10, input.get(i).indexOf("Grade:") - 1);
					//Extracts item grade from text line by using substring and the index of these keywords
					String itemGrade = input.get(i).substring(input.get(i).indexOf("Grade: ") + 7, input.get(i).length());
					//Creates new meat object using the information extracted from the item line of text. Price and quantity are turned into a double and an integer from its previous string state
					Meat meat = new Meat(itemName, Double.parseDouble(itemPriceString), Integer.parseInt(itemQuantityString), itemGrade);
					//adds the new meat item to the inventory
					addItem(meat);
				}
				//Uses the keyword "isOrganic" to know if the new object will be of class vegetable
				if (input.get(i).contains("isOrganic"))
				{
					//Extracts item name from text line by using substring and the index of these keywords
					String itemName = input.get(i).substring(input.get(i).indexOf("Item name: ") + 11, input.get(i).indexOf("Price:") - 1);
					//Extracts item price from text line by using substring and the index of these keywords. Held as a string for now
					String itemPriceString = input.get(i).substring(input.get(i).indexOf("Price: ") + 7, input.get(i).indexOf("	Quantity:"));
					//Extracts item quantity from text line by using substring and the index of these keywords. Held as a string for now
					String itemQuantityString = input.get(i).substring(input.get(i).indexOf("Quantity: ") + 10, input.get(i).indexOf("	isOrganic: "));
					//Extracts item organic status from text line by using substring and the index of these keywords
					String itemOrganicStatusString = input.get(i).substring(input.get(i).indexOf("isOrganic: ") + 11, input.get(i).length());
					//Creates new vegetable object using the information extracted from the item line of text. Price and quantity are turned into a double and an integer from its previous string state
					Vegetable vegetable = new Vegetable(itemName, Double.parseDouble(itemPriceString), Integer.parseInt(itemQuantityString), Boolean.parseBoolean(itemOrganicStatusString));
					//Adds the new vegetable item to the inventory
					addItem(vegetable);
					
				}
			}
		}
		//Handles exception if caught
		catch (Exception e)
		{
			System.out.print("Item could not be added.");
		}
		//Closing operation
		finally
		{
			//Only closes scanner if the scanner exists
			if (scanner != null)
			{
				//closes scanner
				scanner.close();
			}
		}
		
	}
}
