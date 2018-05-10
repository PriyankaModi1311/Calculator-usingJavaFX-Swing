/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ppmod
 */
@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame 
{
    
    private JButton[] keys;
private JPanel keyPadJPanel;
private JTextField lcdJTextField;

    /**
     * @param args the command line arguments
     */
    // constructor sets up GUI
public CalculatorFrame()
{
   super( "Calculator" );

   lcdJTextField = new JTextField( 20 ); // create lcdJTextField
   lcdJTextField.setEditable( true ); // allow user input

   keys = new JButton[ 16 ]; // array keys contains 16 JButtons

   // initialize all digit key buttons
   for ( int i = 0; i <= 9; i++ )
      keys[ i ] = new JButton( String.valueOf( i ) );

   // initialize all function key buttons
   keys[ 10 ] = new JButton( "/" );
   keys[ 11 ] = new JButton( "*" );
   keys[ 12 ] = new JButton( "-" );
   keys[ 13 ] = new JButton( "+" );
   keys[ 14 ] = new JButton( "=" );
   keys[ 15 ] = new JButton( "." );

   // set keyPadJPanel layout to grid layout
   keyPadJPanel = new JPanel();
   keyPadJPanel.setLayout( new GridLayout( 4, 4 ) );

   // add buttons to keyPadJPanel panel
   // 7, 8, 9, divide
   for ( int i = 7; i <= 10; i++ )
      keyPadJPanel.add( keys[ i ] );

   // 4, 5, 6
   for ( int i = 4; i <= 6; i++ )
      keyPadJPanel.add( keys[ i ] );

   // multiply
   keyPadJPanel.add( keys[ 11 ] );

   // 1, 2, 3
   for ( int i = 1; i <= 3; i++ )
      keyPadJPanel.add( keys[ i ] );

   // subtract
   keyPadJPanel.add( keys[ 12 ] );

   // 0
   keyPadJPanel.add( keys[ 0 ] );

   // ., =, add
   for ( int i = 15; i >= 13; i-- )
      keyPadJPanel.add( keys[ i ] );

   // add components to (default) border layout
   add( lcdJTextField, BorderLayout.NORTH );
   add( keyPadJPanel, BorderLayout.CENTER );
} // end CalculatorFrame constructor
} // end class CalculatorFrame