/*
 * Project Euler: Problem 18
 * 
 * Maximum path sum I
 * 
 * By starting at the top of the triangle below and moving to adjacent numbers
 * on the row below, the maximum total from top to bottom is 23.
 * 
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by
 * trying every route. However, Problem 67, is the same challenge with a
 * triangle containing one-hundred rows; it cannot be solved by brute force, and
 * requires a clever method!
 * 
 * Author: Rex Cummings
 * 
 * Date: 02/07/16
 */
public class problem18
{
	public static void main(String[] args)
	{
		System.out.println(new problem18().run());
	}

	/*
	 * Algorithm - Initial thought is to treat the triangle as a binary search
	 * tree (in this case probably arrays) and find the largest sum via an
	 * efficient tree traversal.
	 * 
	 * I may check the largest number in the row and then look at the two leaf
	 * nodes and pick which one is higher. Going two sublevel might work, but I
	 * need to be efficient.
	 */

	public int run()
	{
		int result = 0;
		int[][] path = null;

		// double for-loop

		return result;
	}
}
