package inventorySystemProject;


public interface Perishable
{
	/**
	 * Purpose: Sets the expiration date for an item
	 * @param The expiration date of that item
	 */
	void setExpirationDate(String expirationDate);
	
	/**
	 * Purpose: Gets the expiration date for an item
	 * @return the expiration date
	 */
	String getExpirationDate();
}
