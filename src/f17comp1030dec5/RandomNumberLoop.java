package f17comp1030dec5;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class RandomNumberLoop {
    public static void main(String[] args)
    {
        //create a random number
        SecureRandom rng = new SecureRandom();
        int randomNumber = rng.nextInt(10)+1;
        
        //print the number to the screen
        System.out.printf("The random number was %d%n",randomNumber);
        
        //create a loop for the random number printing my name
        for (int i=1; i<=randomNumber; i++)
        {
            System.out.println("My name is Jaret");
        }
    }
}
