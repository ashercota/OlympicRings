/* OlympicViewer.java - Asher Cota
* 
* Description:
*
* Imports "OlympicFrame" from OlympicFrame.java, sets its title, close operation and visibility to true.
*/

import javax.swing.*;

public class OlympicViewer{
    public static void main(String[] args){
    
        JFrame frame = new OlympicFrame();
        frame.setTitle("Olympic Frame Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
