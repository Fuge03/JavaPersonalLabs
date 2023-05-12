package edu.sdmesa.cisc191;

import java.util.Queue;

public class QueueConsumer
{

	// private ??? queue;
	private Queue<String> queue;
	
	public QueueConsumer(Queue<String> queue)
	{
		this.queue = queue;
	}

	public String consume()
	{
		   if (!queue.isEmpty())
		   {
			   String tempString = queue.element();
			   
			   queue.remove();
			   
			   return tempString;
		   }
		   else
		   {
			   return null;
		   }
	}

}
