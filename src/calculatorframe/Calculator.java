/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorframe;

import javax.swing.JFrame;

/**
 *
 * @author ppmod
 */
public class Calculator {
 
public static void main( String[] args )
{
   CalculatorFrame calculatorFrame = new CalculatorFrame();
   calculatorFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   calculatorFrame.setSize( 200, 200 ); // set frame size
   calculatorFrame.setVisible( true ); // display frame
} // end main
}  // end class Calculator
    

