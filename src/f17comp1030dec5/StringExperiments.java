package f17comp1030dec5;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class StringExperiments {
    public static void main(String[] args)
    {
        //prompt the user for a word
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = keyboard.nextLine();
        
        //display the letters and their index
        for (int i=0; i<word.length(); i++)
        {
            System.out.printf("index: %2d character: %c%n", i, word.charAt(i));
        }
        
        //check if the first letter is a capital
       
    }
    
    /**
     * This method will validate if the first character of the word 
     * is uppercase
     * @param word
     * @return true if the first character is upper case, false otherwise
     */
     public static boolean firstLetterIsCaptial(String word)
    {
        //ASCII characters in the range 65-90 are UPPER case
        if (word.charAt(0) >= 65 && word.charAt(0)<=90)
            return true;
        else
            return false;
    }
}
