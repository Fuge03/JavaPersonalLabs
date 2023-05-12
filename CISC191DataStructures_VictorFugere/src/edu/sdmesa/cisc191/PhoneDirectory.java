package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory
{
	HashMap<String, Integer> phoneDirectory = new HashMap<>();

	public void setNumberForPerson(String name, int phoneNumber)
	{
		phoneDirectory.put(name, phoneNumber);
	}

	public Integer findNumberForPerson(String name)
	{
		return phoneDirectory.get(name);
	}

	public void forget(String name)
	{
		phoneDirectory.replace(name, null);
	}
	
	
}
