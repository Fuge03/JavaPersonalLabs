package inventorySystemProject;

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
 * Responsibilities of class: Template for the creation of Vegetable objects.
 * 
 */

//A vegetable is an item
public class Vegetable extends Item
{
	//A vegetable has a organic status
	private boolean isOrganic;
	
	/**
	 * Purpose: Constructor method for the creationg of a vegetable object
	 * @param Item name
	 * @param Item Price
	 * @param Item Quantity
	 * @param Organic status
	 */
	public Vegetable(String itemName, double price, int quantity, boolean isOrganic)
	{
		//Calls to the super class constructor method
		super(itemName, price, quantity);
		//Sets organic status
		setOrganic(isOrganic);
	}
	
	/**
	 * Purpose: Is this vegetable organic?
	 * @return the organic status of the vegetable item
	 */
	public boolean isOrganic()
	{
		//Returns organic status
		return isOrganic;
	}

	/**
	 * Purpose: Set the organic status of the vegetable
	 * @param Organic status
	 */
	public void setOrganic(boolean isOrganic)
	{
		//Sets organic status
		this.isOrganic = isOrganic;
	}

	/**
	 * Purpose: Formulates vegetable information into a string
	 * @return The item information
	 */
	@Override
	public String toString()
	{
		//Formulates vegetable information
		return "Item name: " + getItemName() + "\tPrice: " 
				+ getPrice() + "\tQuantity: " + getQuantity() + "\tisOrganic: " +
				isOrganic();
	}





}
