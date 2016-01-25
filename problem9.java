/*
 * Project Euler: Problem 9
 * 
 * Special Pythagorean triplet:
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * Author: Rex Cummings
 * 
 * Date: 01/24/16
 *
 */
public class problem9
{
	public static void main(String[] args)
	{
		System.out.println(new problem9().run());
	}
	
	public int run()
	{
		for (int a = 1; a < 1000; a++)
		{
			for (int b = 1; b < 1000; b++)
			{
				int c = 1000 - a - b;

				if (a * a + b * b == c * c)
					return a * b * c;
			}
		}
		return 0;
	}
}
