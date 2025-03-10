import java.util.Random;


/**
 * Program Description
 * will use import random numbers to generate random numbers
 * will use if else to shout output of stars for number bigger than 100
 * and will show no stars for numbers less than 100
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/9/2025
 */
public class BarChart{ 
    public static void main (String[] args) {
        ////variables
        int first, second, third;

        ////generate and assign random numbers section
        //Create a Random object (ie generator)
        Random generator = new Random();//Use generator to create a random number btw 0 and 999 and assign to first.  
        first = generator.nextInt(999);//Do the same for second and third
        second = generator.nextInt(999);
        third = generator.nextInt(999);
        ////Print out numbers
        System.out.println("Number 1 is: " + first);//Message to print out something like,Number 1 is: XXX. Do the same for Number 2 and 3
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println("");  //Print blank line

        
        ////Bar Chart Section
        //Print out NUMBER BAR CHART as a header
        System.out.println("NUMBER BAR CHART");

        
        ////first stars
        System.out.print("Number 1: ");
        if (first<100)
            System.out.print("<100 no stars");
        else
            for (int i = 1; i<=first/100; i++){
                System.out.print("*");  

            }
        System.out.println("");//Print line to get to a new line
        
        ////second stars
        System.out.print("Number 2: ");//Print out "Number 2: " without a line break
        if (second<100)
            System.out.print("<100 no stars");//Print out "<100 no stars"
        else //else
            for (int i = 1; i<=second/100; i++){//for loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (second/100)
                System.out.print("*");//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
                
            }   
       System.out.println(""); //Print line to get to a new line
        
        ////third stars
        System.out.print("Number 3: ");//Print out "Number 3: " without a line break
        if (third<100)//if (third<100)
            System.out.print("<100 no stars");//Print out "<100 no stars"
        else//else
           for (int i = 1; i<=third/100; i++){//for loop that prints out stars for each 100 (ie 356 prints out 3 stars).  Take advantage of integer division here (third/100)
                System.out.print("*");//Print a *, HINT-The stars should be horizontal (on 1 line) for each number.
            }
       System.out.println(""); //Print line to get to a new line //Print line to get to a new line
    }////end main ()
}////end class