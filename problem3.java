import java.util.ArrayList;

/*
 * Project Euler: Problem 3
 * 
 * Largest prime factor:
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 * 
 * Author: Rex Cummings
 * 
 * Date: 01/20/16
 * 
 * Note: This attempt was not refined in any capacity, since I was going for
 * uniqueness.
 */
public class problem3
{
	public static void main(String[] args)
	{
		System.out.println(new problem3().run());
	}
    
	public int run()
	{
		long result = 0L;
		long number = 600851475143L;

		result = greatestPrimeFactor(number);

		return (int) result;
	}

	/*
	 * greatestPrimeFactor - Finds the greatest prime factor in a specific long number.
	 */
	private static long greatestPrimeFactor(long n)
	{
		Long greatestPrimeFactor = 0L;
		ArrayList<Long> listOfPrimeFactors = new ArrayList<Long>();

		for (long i = 2; i <= n; i++)
		{
			// If i is a factor of N add to list of factors
			if (n % i == 0 && isPrime(i))
			{
				listOfPrimeFactors.add(i);
				// Repeatedly divide it out
				while (n % i == 0)
					n = n / i;
			}
		}

		// Obtain the last factor in the list since its the largest.
		greatestPrimeFactor = listOfPrimeFactors.get(listOfPrimeFactors.size() - 1);

		return greatestPrimeFactor;
	}

	/*
	 * isPrime - Checks whether an integer is prime or not.
	 */
	private static boolean isPrime(long n)
	{
		for (long i = 2; i < n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
