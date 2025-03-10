import javax.swing.JOptionPane;
/**
 * Program will use a dialog box to enter string
 * user will enter character
 * need to create a loop to count the letters with in the string
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 3/9/2025
 */
public class progchall5
{
    public static void main (String[] args){
    //variables
    String stringone, letter;
    int numbercharacter;
    
    
    stringone = JOptionPane.showInputDialog("Enter a String "); 
    letter= JOptionPane.showInputDialog("Enter a char to be assesed ");
    numcharacter = letter.trim();
    //
    
    
    JOptionPane.showMessageDialog("In the phrase: "+ stringone\n +"There are "+ numbercharacter+" "+letter+"'s"));
}
