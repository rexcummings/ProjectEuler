/*
 * Project Euler: Problem 10
 * 
 * Summation of Primes:
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the
 * primes below two million.
 * 
 * Author: Rex Cummings
 * 
 * Date: 01/25/16
 */
public class problem10
{
	public static void main(String[] args)
	{
		System.out.println(new problem10().run());
	}

	public long run()
	{
		long sumOfPrimes = 0;

		for (long i = 1; i < 2000000; i++)
		{
			if (isPrime(i))
				sumOfPrimes += i;
		}
		return sumOfPrimes;
	}

	/*
	 * isPrime - Checks whether an integer is prime or not.
	 * 
	 * Algorithm: For loop more efficient when incrementing by 2, since even
	 * numbers are taken care of in earlier conditionals. Function performs
	 * faster than if incrementing by 1.
	 * 
	 * Note: Updated version that checks all cases except negative numbers.
	 */
	private static boolean isPrime(long n)
	{
		if (n == 0 || n == 1)
			return false;
		else if (n == 2)
			return true;
		else
		{
			if (n % 2 == 0)
				return false;
			for (int i = 3; i <= (int) Math.sqrt(n); i += 2)
			{
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}
}
