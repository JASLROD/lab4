import java.util.Scanner;

/**
 * Program Description
 * will use scanner to enter temerpatures
 * will use do-while loop to convert f to c
 * will use loop to continue
 * program will ignore upper and lower case yes
 * 
 * @author Jasmin Leonrodriguez jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/9/2025
 */

public class Temperature{ 
    public static void main (String[] args){
        ////variables
        int inputTemp; // temp entered by the user
        int outputTemp; 
        char inputUnit;
        //create Scanner object to read in keyboard
        Scanner keyboard = new Scanner(System.in);

        do{ System.out.print("Enter msg to user something like, Enter a whole number, a space, and C or F” +  “ie 100 F converts to Cels: ");
            inputTemp = keyboard.nextInt();
            inputUnit = keyboard.next().toUpperCase().charAt(0);

            while(!(inputUnit=='C'|| inputUnit=='F'))

            {
                System.out.print("Enter C or F, F converts to Cels: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }

            //Operations
            if (inputUnit=='F')
            {
                outputTemp = (inputTemp-32) * 5.0/9.0;
                System.out.print("%d%c converted is %.1fC\n", inputTemp, inputUnit, outputTemp);
            }         
            else
            {
                outputTemp = inputTemp *9.0/5.0+32;
                System.out.print("%d%c converted is %.1fF\n", inputTemp, inputUnit, outputTemp);

                System.out.print("Enter yes to calulate another temp: ");
            }

            while(keyboard.next().equalsIgnoreCase("yes"));
        }

    } //// end main ()
} //// end class