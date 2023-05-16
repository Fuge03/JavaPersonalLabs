package cisc191.sdmesa.edu;

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
public class Recursion
{
	/**
	 * Add n to the sum of all integers less than n (but not negative)
	 * @param n
	 * @return the sum of n+(n-1)+...+1
	 */
	public static int addLess(final int n)
	{
		if(n == 0 || n==1)
		{
			return n;
		}
		else
		{
			return n + addLess(n-1);
		}
	}
	
	/**
	 * Multiply all integers n and less (but not negative)
	 * @param n
	 * @return the product n*(n-1)*...*1
	 */
	public static int multiplyLess(final int n)
	{
		if(n == 1)
		{
			return n;
		}
		else
		{
			return n * multiplyLess(n-1);
		}
	}
	
	/**
	 * Calculate the n'th Lucas number.
	 * @see Lucas numbers. (n.d.). Brilliant | Learn interactively. https://brilliant.org/wiki/lucas-numbers/
	 * See why Lucas number are better than Fibonacci number, watch:
	 * @see Parker, M. (n.d.). Lucas Numbers - Numberphile [Video]. YouTube. https://www.youtube.com/watch?v=PeUbRXnbmms
	 * @see Parker, M. (n.d.). Golden Ratio BURN (Internet Beef) - Numberphile [Video]. YouTube. https://www.youtube.com/watch?v=cjx23aMeBkQ
	 * 
	 * @param n the number of the Lucas number
	 * @return L(n) = L(n-2) + L(n-1)
	 */
	public static int lucas(final int n)
	{
		switch (n)
		{
			
			case 0: return 2;
                  
			case 1: return 1;
			           
			default: return lucas(n - 2) + lucas(n - 1); 
			
		}
	}
	
	/**
	 * Calculate the end balance given a starting balance, and interest rate
	 * (given as a decimal) and the number of times interest is added.
	 * 
	 * @param startBalance
	 * @param interestRate
	 * @param periods
	 * @return ending balance
	 */
	public static double calculateEndBalance(final double startBalance,
			final double interestRate, final int periods)
	{
		if (periods == 0)
		{
			return startBalance;
		}
		else
		{
			// TODO:
			// Calculate the end balance for the first n-1 periods
			// The start balance for the n'th period is the end balance for the first n-1 periods
			// Then calculate the end balance for the n'th period
			
			return calculateEndBalance(startBalance + (startBalance * interestRate), interestRate, periods - 1);
		}
	}

	/**
	 * Calculate the ending population
	 * 
	 * @param startPopulation the starting population
	 * @param maxPopulation the maximum population that the environment will sustain
	 * @param growthRate starting growth rate, 0 < growth rate < 1
	 * @param periods
	 * @return the ending population
	 */
	public static int calculateEndPopulation(final int startPopulation,
			final int maxPopulation, final double growthRate, final int periods)
	{
		if(periods == 0)
		{
			return startPopulation;
		}
		else
		{
			int newPopulation = (int) (startPopulation + (growthRate * (1 - (double)startPopulation / maxPopulation)) * startPopulation);
			
			return calculateEndPopulation(newPopulation, maxPopulation, growthRate, periods - 1);
			
			//calculateEndPopulation(, maxPopulation, )
		}
		/*if (calculateEndPopulation(startPopulation, maxPopulation, growthRate, periods) > maxPopulation || periods == 0)
		{
			return;
		}
		
		return calculateEndPopulaton(startPopulation, maxPopulation, growthRate, periods - 1);*/
	}

}
