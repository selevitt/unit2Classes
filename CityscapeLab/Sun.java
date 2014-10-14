import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Class3 here.
 * 
 * @Seth (your name) 
 * @10/11/14 (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xTopLeft;
    private int yTopLeft;
    private int screenWidth;
    private int screenHeight;
 

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x, int y, int width, int height)
    {
        screenWidth = width;
        screenHeight = height;
        xTopLeft = x;
        yTopLeft = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D sun = new Ellipse2D.Double(xTopLeft, yTopLeft, screenWidth, screenHeight);
        
        g2.setColor(Color.YELLOW);
        
        g2.fill(sun);
    }

}
