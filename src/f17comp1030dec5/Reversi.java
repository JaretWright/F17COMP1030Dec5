/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17comp1030dec5;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Reversi {
    public static void main(String[] args)
    {
        //prompt the user for a word
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = keyboard.nextLine();
        
        //display the word in reverse
        for (int i=word.length()-1; i>=0;i--)
            System.out.printf("%c", word.charAt(i));
        
        System.out.println();
    }
}
