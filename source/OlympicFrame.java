/* OlympicFrame.java - Asher Cota - ACO 102
* 
* Description:
*
* Creates "OlympicFrame" as an extension of JFrame, creates JButton, sets
* window size and adds the Olympic rings and JButton to JPanel
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OlympicFrame extends JFrame{
   
   JButton buttonSouth = new JButton("Click to draw the Olympic Rings");
   
   // Window size variables
   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 300;
   
   public OlympicFrame(){
      createComponents();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
   private void createComponents(){
       
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(buttonSouth, BorderLayout.SOUTH);
      add(panel);
      
      /* Adds Olympic rings from OlympicDraw.java to the JPanel upon
      buttonSouth being clicked */
      buttonSouth.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              OlympicDraw ringComponent = new OlympicDraw();
              panel.add(ringComponent);
              buttonSouth.setText("Success!");
          }
      });
   }

}