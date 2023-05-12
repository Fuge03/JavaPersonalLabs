package inventorySystemProject;

//Meat is an item and it is gradable
public class Meat extends Item implements Gradable
{
	//Meat has a grade
	private String grade;
	
	/**
	 * Purpose: Constructor method for a meat object
	 * @param Item name
	 * @param Item price
	 * @param Item quantity
	 * @param Meat grade
	 */
	public Meat(String itemName, double price, int quantity, String grade)
	{
		//Calls to the superclass constructor method 
		super(itemName, price, quantity);
		//Sets meat grade
		setGrade(grade);
	}
	
	/**
	 * Purpose: Sets the grade of the meat
	 */
	public void setGrade(String grade)
	{
		//Sets the grade
		this.grade = grade;
	}
	
	/**
	 * Purpose: gets the grade of the item
	 */
	public String getGrade()
	{
		//Returns the grade
		return grade;
	}

	/**
	 * Purpose: Formulates meat item information into a string
	 */
	public String toString()
	{
		//Returns the formatted string
		return "Item name: " + getItemName() + "\tPrice: " 
				+ getPrice() + "\tQuantity: " + getQuantity() + "\tGrade: " +
				getGrade();
	}
}
