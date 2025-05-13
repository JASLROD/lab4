import javax.swing.JOptionPane;

/**
 * Program Description
 * will use input dialog box to eneter max of stars 
 * will use for loop to create the star pattern
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.1
 * @since 5/13/2025
 */

public class Stars{ 
    public static void main (String args[]){
        ////variables
        int width, line, spaces, stars;
        String temp;

        //String temp for JOptionPane input

        temp = JOptionPane.showInputDialog("Enter max width for stars ");//JOptionPane to get user input, something like "Enter max width for stars"
        width = Integer.parseInt(temp);//convert input string to int and set to width

        //test to see if width is even (width%2==0).  If true increment width by 1.  Ensures width is an odd number
        if(width%2 ==0){
            width++;
        }
        
        ////top half 
        for (line = 1, spaces = width/2; line <=width/2 + 1; line++,spaces--){ ////how many lines should be based on width
            for (int i=1;i<=spaces;i++){  //this is for spaces
                System.out.print(" ");
            }
            for (int i=1;i<=line*2-1;i++){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }

        ////bottom half
        for (line= width/2,spaces=1;line>0;line--,spaces++){  //opposite to the top half 
            for (int i=1;i<=spaces;i++){  //this is for spaces
                System.out.print(" ");
            }
            for (int i=1;i<=line*2-1;i++){  //this is for stars
                System.out.print("*");
            }
            System.out.println("");  //this gets to next line
        }
        System.exit(0);  //Kills JOptionPane GUI thread
    }  ////end main()
} ////end class