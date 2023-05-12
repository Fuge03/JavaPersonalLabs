package edu.sdmesa.cisc191;
/**
 * Lead Author(s):
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:
 * 
 * Responsibilities of class:
 * 
 */
import java.util.ArrayList;

public class ArrayListProducer
{
	// private ??? list;
	private ArrayList<String> list;

	public ArrayListProducer(ArrayList<String> list)
	{
		this.list = list;
	}

	public void produce(int i, String string)
	{
		list.add(i, string);
	}

}
