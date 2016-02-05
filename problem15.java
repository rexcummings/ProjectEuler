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
	private static final int	WIDTH	= 20;
	private static final int	LENGTH	= 20;

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
	 * I can create a function called findPaths() which iterates from a specific
	 * cell in such a manner that it can be reused/applied to various cells in a
	 * similar position.
	 * 
	 * Since I haven't used recursion in awhile I might try to devise the
	 * findPaths() function to assume its starting position is on the diagonal
	 * and make cases for each possible path it could take.
	 * 
	 * I may need to create a helper function to check that the paths taken
	 * don't go outside the range of the square grid.
	 */
	public int run()
	{
		int result = 0;

		return result;
	}
}
