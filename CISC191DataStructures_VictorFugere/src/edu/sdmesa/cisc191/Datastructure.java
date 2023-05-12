package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Datastructure
{
	public static boolean isPalindrome(char[] letters)
	{
		// TODO:
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		Stack<Character> stack = new Stack<Character>();
		
        Queue<Character> queue = new LinkedList<Character>();
		
        for (int i = 0; i < letters.length; i++)
        {
        	
        	stack.add(letters[i]);
        	
        	queue.add(letters[i]);
        }
		
        while (!queue.isEmpty( )) 
        {
            if (!queue.remove().equals(stack.pop( )))
            {
                return false;
            }
        }
		
		return true;
	}

}
