/**
 * @author Thomas Washington
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
  * 
  * Main method.
  * First prints out the juggler and the menu.
  * Waits for integer input.
  * Depending on input, the juggler will throw a ball, catch a ball, pass a ball between hands, or quit the program.
  * While loop can keep taking in input and modifying ball placement.
  */
 public static void main(String[] args)
 {
  Juggler stephen = new Juggler();
  System.out.println("\nStephen, the juggler, is learning to do a shower trick...");
  System.out.println("He has " + stephen.getNumUnthrownBalls() + " balls");
                     
  Scanner sc = new Scanner(System.in);
  
  System.out.println(stephen.toString());
  int i = PA1.doMenu(sc);
  
  while (i != 4) {
    if (i == 1) {
      try {
        stephen.throwBall();
      }
      catch (Exception e) {
        System.out.println("Not enough balls!");
        stephen = new Juggler();
        System.out.println("Stephen drops everything.");
        System.out.println("Stephen wants to try again.");
        System.out.println("He has " + stephen.getNumUnthrownBalls() + " balls");
      }
    }
    else if (i == 2) {
      try {
        stephen.passBall();
      }
      catch (Exception e) {
        System.out.println("Too many balls!"); 
        stephen = new Juggler();
        System.out.println("Stephen drops everything.");
        System.out.println("Stephen wants to try again.");
        System.out.println("He has " + stephen.getNumUnthrownBalls() + " balls");
      }
    }
    
    else if (i == 3) {
      try {
        stephen.catchBall();
      }
      catch (Exception e) {
        System.out.println("Not enough balls!");
        stephen = new Juggler();
        System.out.println("Stephen drops everything.");
        System.out.println("Stephen wants to try again.");
        System.out.println("He has " + stephen.getNumUnthrownBalls() + " balls");
      }
    }
    else if (i == 4) {
      break;
    }
    else {
      System.out.println("Invalid selection!"); 
    }
    System.out.println(stephen.toString());
    
    i = PA1.doMenu(sc);
  }
  
  //the following messages may be useful as well:
  //System.out.println("Stephen dropped everything.");
  //System.out.println("Stephen wants to try again...\nHe has " + stephen.getNumUnthrownBalls() + " balls");
 }
 
 /**
  * @param
  * @return
  * Prints out a selection menu and waits for user input.
  * If the input is the wrong type, acknowledge that and retry.
  */
 public static int doMenu(Scanner in)
 {
   System.out.println("\nStephen can:");
   System.out.println("1) Throw a ball into the air");
   System.out.println("2) Pass a ball between hands");
   System.out.println("3) Catch a ball from the air");
   System.out.println("4) Quit");
   System.out.print("\nWhat should he do? ");
   
   int j = 0;
   
   try {
     j = in.nextInt();
   }
   catch (InputMismatchException e) {
     System.out.println("Invalid selection");
     Scanner sc = new Scanner(System.in);
     j= PA1.doMenu(sc);
   }
   
   return j;
 }
}
