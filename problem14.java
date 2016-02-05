/*
 * Project Euler: Problem 14
 * 
 * Longest Collatz Sequence
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1. Which starting number,
 * under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * Author: Rex Cummings
 * 
 * Date: 02/04/16
 */
public class problem14
{
	public static void main(String[] args)
	{
		System.out.println(new problem14().run());
	}

	public long run()
	{
		long longest = -1;
		long result = 0;

		for (long i = 1; i < 1000000; i++)
		{
			long size = 0;

			size = processNumber(i);
			if (size > longest)
			{
				longest = size;
				result = i;
			}
		}

		return result;
	}

	/*
	 * processNumber - Find the length of the chain of n based the Collatz
	 * Problem.
	 */
	private static long processNumber(long n)
	{
		long size = 0;

		while (n != 1)
		{
			if ((n & 1) == 0) // n is even
				n = n / 2;
			else              // n is odd
				n = 3 * n + 1;
			size++;
		}

		return size;
	}
}
