import java.util.Scanner;
import java.util.Random;

/******************************************************************************

                            random number generator that takes user 
                            input and adds it to get a sum

*******************************************************************************/



public class RandomAddition
{
	public static void main(String[] args) {
		
		int bigNumber; // large Number
		int number; // regular number
		int smallNumber; // small number
		int sum; //sum of numbers
		int userAnswer; //the users answer
		
		
		
		
		//Scanner to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Random number generator
		Random myRandoNumbs = new Random();
		
		//get three random numbers
		bigNumber = myRandoNumbs.nextInt(1000);
		smallNumber = myRandoNumbs.nextInt(20);
		number = myRandoNumbs.nextInt(50) + 1;
		
		//display additon problem
		System.out.println("What is the answer to this addition problem?");
		System.out.print(number + " + " + bigNumber + " + " + smallNumber + " = ");
		
		//calculate the problem
		sum = number + bigNumber + smallNumber;
		
		
		//get the users answer
		userAnswer = keyboard.nextInt();
		
		//display the users results
		if (sum == userAnswer) {
		    System.out.println("Correct you now have the ability to do a backflip " +
		     "with no hands. Give it a try!");
		}
		else {
		    System.out.println("Incorrect. Try that again, "
		    + "the answer is actually "  + sum);
		}
		
		
		
		
	}
}