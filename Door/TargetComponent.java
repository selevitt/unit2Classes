import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws the Target/ 3 circles
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    
    /**
     * Default constructor for objects of class TargetComponent
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target tar1 = new Target(150, 150);
        
        tar1.draw(g2);
        
        
        
    }

    
    }
