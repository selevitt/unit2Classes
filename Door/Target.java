import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws the ellipse
 * 
 * @Seth (your name) 
 * @9/22/14 (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xCenter;
    private int yCenter;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        xCenter = x;
        yCenter = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xCenter - 12.5, yCenter - 12.5, 25, 25);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xCenter - 25, yCenter - 25, 50, 50);
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xCenter - 37.5, yCenter - 37.5, 75, 75);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(xCenter - 50, yCenter - 50, 100, 100);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(xCenter - 62.5, yCenter - 62.5, 125, 125);
        
        Color color1 = new Color(176, 23, 31);
        color1.createContext();
        circle1.setPaint(color1);
        
        g2.draw(circle1);
        g2.draw(circle2);
        g2.draw(circle3);
        g2.draw(circle4);
        g2.draw(circle5);
        
    }

}
