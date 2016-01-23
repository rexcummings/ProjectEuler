import static java.lang.Math.abs;

/*
 * Project Euler: Problem 6
 * 
 * Sum square differencs:
 * 
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385
 *
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)2 = 552 = 3025 Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * Author: Rex Cummings
 * 
 * Date: 01/22/16
 */
public class problem6
{
	public static void main(String[] args)
	{
		System.out.println(new problem6().run());
	}

	public int run()
	{
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int diff = 0;

		for (int i = 1; i < 101; i++)
			sumOfSquares += i * i;
		for (int j = 1; j < 101; j++)
			squareOfSum += j;
		squareOfSum = squareOfSum * squareOfSum;

		diff = abs(sumOfSquares - squareOfSum);

		return diff;
	}
}
