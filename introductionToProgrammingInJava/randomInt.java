/*
Compile: javac randomInt.java
Execute: java randomInt N

Purpose: Prints a random number between 0 and (N - 1)

*/

public class randomInt
{
	public static void main(String[] args)
	{
		int	N = Integer.parseInt(args[0]);

		double	r = Math.random();
		int	n = (int) (r * N);

		System.out.println("Your random integer between 0 and " + N + " is: " + n); 
	}
}
