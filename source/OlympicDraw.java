/* OlympicDraw.java - Asher Cota - ACO 102
* 
* Description:
*
* Sets the colors of Olympic rings. Also passes the colors, a set of x and y
* coordinates, and ring size into a "drawRing" method which creates the rings.
* These rings will be added to the JFrame in OlympicFrame.java
*/

import javax.swing.*;
import java.awt.*;

public class OlympicDraw extends JComponent{
    @Override
   public void paintComponent(Graphics g){
       /* Colors of rings are stored as variables for sake of easy access
       and interchangeability */
       Color OlympicBlue = new Color(39, 157, 255);
       Color OlympicBlack = new Color(5, 5, 5);
       Color OlympicRed = new Color(240, 2, 0);
       Color OlympicYellow = new Color(246, 198, 18);
       Color OlympicGreen = new Color(46, 220, 13);
       
       // Top three rings
       drawRing(g, OlympicBlue, 85, 50, 100);
       drawRing(g, OlympicBlack, 195, 50, 100);
       drawRing(g, OlympicRed, 305, 50, 100);
       // Bottom two rings
       drawRing(g, OlympicYellow, 140, 100, 100);
       drawRing(g, OlympicGreen, 250, 100, 100);
   }
   
   /**
    * 
    * @param g Graphics
    * @param color color to be applied to the ring
    * @param xLeft position of ring on the x-axis from the left
    * @param yTop position of ring on the y-axis from the top
    * @param size size in pixels used for the height and width of ring (height
    * and width are the same value for perfect circles, so this variable is
    * used for both)
    */
   public void drawRing(Graphics g, Color color, int xLeft, int yTop, int size){
        // Draws ring with the given color, coordinates and size parameters
        g.setColor(color);
        g.drawOval(xLeft, yTop, size, size);
   }
}