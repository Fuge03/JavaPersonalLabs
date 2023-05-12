package inventorySystemProject;


public abstract class Item 
{
	//An item has a price
	private double price;
	//An item has a quantity
	private int quantity;
	//An item has a name
	private String itemName;
	
	/**
	 * Purpose: Superclass constructor method for the creation of an item object
	 * @param Item name
	 * @param Item price
	 * @param Item quantity
	 */
	public Item(String itemName, double price, int quantity)
	{
		//Sets item name
		setItemName(itemName);
		//Sets item price
		setPrice(price); 
		//Sets item quantity
		setQuantity(quantity);
	}

	/**
	 * Purpose: Gets item price
	 * @return Item price
	 */
	public double getPrice()
	{
		//Returns item price
		return price;
	}

	/**
	 * Purpose: Sets item price
	 * @param Item price
	 */
	public void setPrice(double price)
	{
		//Sets item price
		this.price = price;
	}
	
	/**
	 * Purpose: Sets item quantity
	 * @param Item quantity
	 */
	public void setQuantity(int quantity)
	{
		//Sets item quantity
		this.quantity = quantity;
	}
	
	/**
	 * Purpose: Gets item quantity
	 * @return Item quantity
	 */
	public int getQuantity()
	{
		//Returns item quantity
		return quantity;
	}
	
	/**
	 * Purpose: Changes item quantity
	 * @param Item quantity change
	 */
	public void changeQuantity(int quantityChange)
	{
		//Changes item quantity
		quantity = quantity + quantityChange;
	}

	/**
	 * Purpose: Gets item name
	 * @return Item name
	 */
	public String getItemName()
	{
		//Returns item name
		return itemName;
	}

	/**
	 * Purpose: Sets item name
	 * @param Item name
	 */
	public void setItemName(String itemName)
	{
		//Sets item name
		this.itemName = itemName;
	}
	
	/**
	 * Purpose: Formulates item information into a string
	 */
	public String toString()
	{
		//Returns formulated information
		return "Item name: " + getItemName() + "\tPrice: " 
				+ getPrice() + "\tQuantity: " + getQuantity();
	}
	
	
		
	
}