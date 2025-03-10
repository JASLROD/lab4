import java.util.Scanner;

/**
 * Program Description
 * will use scanner to input word to verify if they are palindromes
 * will use do-while loop to flip the word 
 * will use if else to see if it works or doesnt work
 * 
 * @author Jasmin Leonrodriguez jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/9/2025
 */

public class ReverseWord{ 
    public static void main (String[] args){
        ///variables 
        String word, remaining, combined, flipped;
        char firstLetter;

        //Create Scanner object to get input
        Scanner keyboard = new Scanner (system.in);

        do{  ////optional do while.  Get main program up and running and then the do while
            System.out.print("Enter a series of words to test as palindromes, end with quit: ");
            word = keyboard.next().toLowerCase();
            while(!(word.equals("quit"))){
                firstLetter = word.charAt(0);
                remaining = word.string(1);
                combined = remaining + firstLetter;
                flipped="";
                for(int i=combined.length()-1;i>=0;i--)
                {
                    flipped+=combined.charAt(i); 
                } 
                if(word.equls(flipped)) /// Iam confused when it comes to having if else conditions with in a loop. Do I close thesewith brackets?
                    System.out.println(word + "works");
                else
                    System.out.println(word + "does not work");
                    word = keyboard.next().toLowerCase();
            } ////end while, I follow your hints but minor errors prevent me from compiling. 
        }///end main
    }/// end class