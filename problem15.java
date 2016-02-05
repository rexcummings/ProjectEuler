import java.math.BigInteger;

/*
 * Project Euler: Problem 15
 * 
 * Lattice paths:
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * Author: Rex Cummings
 * 
 * Date: 02/05/16
 */
public class problem15
{

	public static void main(String[] args)
	{
		System.out.println(new problem15().run());
	}

	/*
	 * Algorithm - My initial thought process is to mentally draw a diagonal
	 * line from two opposite corners of the grid. Using this I can find all the
	 * possible paths in either the upper or lower triangle and double that
	 * number to find the total number of paths in the whole 20 x 20 grid. This
	 * is mentally easier to code and less resource intensive.
	 * 
	 * New Idea - Since we are dealing with a square grid there must be a simple
	 * formula to calculate the number of paths. I'm a visual learner so after
	 * finding the number of paths for 2x2, 3x3 and 4x4 being 6, 20, 70 respectfully
	 * grid I saw an easy formula that I remembered from discrete structures 
	 * dealing with permutations and combinations.
	 * 
	 * Formula: 2n Choose n
	 */
	private static final int SIDELENGTH = 20;

	public BigInteger run()
	{
		BigInteger result = BigInteger.ONE;

		result = numOfPaths(2 * SIDELENGTH, SIDELENGTH);

		return result;
	}

	/*
	 * numOfPaths - Calculate the number of paths for an N x N square grid,
	 * where we start in one corner and end in opposite corner.
	 * 
	 * Note: Formula is based on combination of 2N choose N.
	 */
	private static BigInteger numOfPaths(int N, int I)
	{
		BigInteger result = BigInteger.ONE;

		for (int i = 0; i < I; i++)
			result = result.multiply(BigInteger.valueOf(N - i)).divide(BigInteger.valueOf(i + 1));
		return result;
	}
}
