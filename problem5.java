/*
 * Project Euler: Problem 5
 * 
 * Smallest Multiple:
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 * Author: Rex Cummings
 * 
 * Date: 01/22/16 
 */
public class problem5
{
	public static void main(String[] args)
	{
		System.out.println(new problem5().run());
	}

	/*
	 * Algorithm - Based on Eulcid's approach, I chose to find the LCM by using
	 * the reduction via GCD. From there its straightforward. 
	 */
	public int run()
	{
		int result = 1;

		for (int i = 1; i < 21; i++)
		{
			result = lcm(result, i);
		}

		return result;

	}

	/*
	 * lcm - Find the least common multiple
	 */
	private static int lcm(int a, int b)
	{
		return a * (b / gcd(a, b));
	}

	/*
	 * gcd - Euclid's algorithm to find greatest common factor.
	 */
	private static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return (gcd(b, a % b));
	}
}
