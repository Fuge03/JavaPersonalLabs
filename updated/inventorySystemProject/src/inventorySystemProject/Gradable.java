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
 * Responsibilities of class: Certain objects have a grade. Interface for graded items.
 * 
 */

public interface Gradable
{
	/**
	 * Purpose: Sets the grade for an item
	 * @param The grade of that item
	 */
	void setGrade(String grade);
	
	/**
	 * Purpose: Gets the grade of an item
	 * @return The grade of that item
	 */
	String getGrade();
}
