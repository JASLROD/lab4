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
    String input, temp, output;
    char letter;
    int letterAmount = 0;
    
    
    //dialog box for input
    temp  = JOptionPane.showInputDialog("Enter a String "); 
    input = temp;
    
    temp = JOptionPane.showInputDialog("Enter a char to be assesed ");
    letter = temp.trim().toLowerCase().charAt(0);
   
    
    //
    for(int i= 0; i<=input.length()-1; i++){
        if(input.charAt(i) == letter){
            letterAmount++;
        }
    }
    
    
    //display output
    JOptionPane.showMessageDialog(null, String.format ("In the phrase: %s \nThere are %d %c 's",input, letterAmount, letter));
}
}
