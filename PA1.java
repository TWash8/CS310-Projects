/**
 * @author Your Name Here
 * CS310
 * Fall 2017
 */
 
import java.util.*;

/**
 * 
 */
class PA1
{
	/**
	 * @param
	 */
	public static void main(String[] args)
	{
		Juggler stephen = new Juggler();
		System.out.println("\nStephen, the juggler, is learning to do a shower trick...");
		System.out.println("He has " + stephen.getNumUnthrownBalls() + " balls");
		
		//your code here
		
		//the following messages may be useful as well:
		//System.out.println("Stephen dropped everything.");
		//System.out.println("Stephen wants to try again...\nHe has " + stephen.getNumUnthrownBalls() + " balls");
	}
	
	/**
	 * @param
	 * @return 
	 */
	public static int doMenu(Scanner in)
	{
		System.out.println("\nStephen can:");
		System.out.println("1) Throw a ball into the air");
		System.out.println("2) Pass a ball between hands");
		System.out.println("3) Catch a ball from the air");
		System.out.println("4) Quit");
		System.out.print("\nWhat should he do? ");
		
		//your code here
		return 0;
	}
}