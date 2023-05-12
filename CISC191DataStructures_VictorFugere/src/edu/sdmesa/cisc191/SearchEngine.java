package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.HashMap;


public class SearchEngine
{
	private HashMap<String, ArrayList<String>> searchEngine = new HashMap<>();

	public void add(String keyword, String url)
	{
        ArrayList<String> urls = searchEngine.get(keyword);

        
		if (urls == null)
		{
			urls = new ArrayList<String>();
			
			searchEngine.put(keyword, urls);
		}
		if (url != null)
		{
			urls.add(url);
		}
		
	}

	public ArrayList<String> search(String keyword)
	{
		ArrayList<String> urls = searchEngine.get(keyword);
		
		if (urls == null)
		{
			ArrayList<String> empty = new ArrayList<>();
			
			return empty;
		}
		else
		{
			//Use copy constructor
			ArrayList<String> copy = new ArrayList<>(urls);
			
			return copy;
		}
	}	
}
