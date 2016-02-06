import java.math.BigInteger;

/*
 * Project Euler: Problem 16
 * 
 * Power digit sum:
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * Author: Rex Cummings
 * 
 * Date: 02/06/16
 */
public class problem16
{
	public static void main(String[] args)
	{
		System.out.println(new problem16().run());
	}

	public int run()
	{
		int exponent = 1000;
		BigInteger base = BigInteger.valueOf(2);
		BigInteger value = BigInteger.ZERO;
		int sum = 0;

		value = base.pow(exponent);
		String str = value.toString();

		for (int i = 0; i < str.length() - 1; i++)
			sum += (int) (str.charAt(i) - '0');

		return sum;
	}
}
