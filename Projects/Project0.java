//Vishwa Patel 24485647

//Swing is a part of the JFC (Java Foundation Class) library and we used it to create graphical user interface.
import javax.swing.*;

public class Project0 {
    public static void main(String[] args){
        String inputWord;
        int uppercaseE = 0, lowercaseE = 0; //Assign these the value of 0 since they have to increase by 1 when a 'E' or 'e' is found.
        
        inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence");

        //loop through every character in that string.
        for (int i = 0; i < inputWord.length(); i++) {
            
            char c = inputWord.charAt(i);  //Loops through every character in that string as a char.

            //Increases the counter variables by 1 everytime a 'e' or 'E' char is read by the for loop.
            if (c == 'E') {
                
                uppercaseE++;
            }
            else if (inputWord.charAt(i) == 'e') {
                
                lowercaseE++;
                
            }
        }

        JOptionPane.showMessageDialog(null, "Uppercase E's: " + uppercaseE + "\nLowercase e's: " + lowercaseE);

        while (!inputWord.equalsIgnoreCase("Stop")) {
    
        inputWord = JOptionPane.showInputDialog("Type a sentence:");
}
    }
}