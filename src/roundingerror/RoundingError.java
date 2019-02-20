/*
 * @Henry Huang
 * RoundingError.java
 * Feb 19,2019
 * This prpgram is designed to compare the square of the square root of any number.
 */
package roundingerror;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //Listing all required variables
        double num;
        double square;
        double squareRoot;
        double error;
        
        String numStr;
        
        //Ask user for an input
        numStr =JOptionPane.showInputDialog("Please Enter A Number:");
        
        //Convert the input from string form to double
        num = Double.parseDouble(numStr);
        
        //Calculate the square root of the input
        squareRoot = Math.sqrt(num);
        
        //Clculate the square of the square root of the input
        square = Math.pow(squareRoot,2);
        
        //Calculate the rounding error between the input and the square of the square root of the input
        error = num - square;
        
        
        
        //System.out.println(squareRoot);
        //System.out.println(square);
        //System.out.println(error);
        
        //Display the results
        JOptionPane.showMessageDialog(null,"The Square of The Square Root is = " + square +
                "\nThe Rounding Error  = " + error);
        
    }
    
}
