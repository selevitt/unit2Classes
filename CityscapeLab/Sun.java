import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * The Sun class draws a sun in the upper right corner that stays proportional to the scren size while stile staying a circle.
 * 
 * @Seth (your name) 
 * @10/11/14 (a version number or a date)
 */
public class Sun
{
    /** The upper left x value of the rectangle the circle is in. */
    private int xTopLeft;
    /** The upper left y value of the rectangle the circle is in. */
    private int yTopLeft;
    /** The radius of the ellipse. */
    private int screenWidth;
    /** The radius of the ellipse. */
    private int screenHeight;
 

    /**
     * The constructor of the Sun Class. Establishes the x, y, width, and height of the ellipse.
     */
    public Sun(int x, int y, int width, int height)
    {
        screenWidth = width;
        screenHeight = height;
        xTopLeft = x;
        yTopLeft = y;
    }

    /**
     * This draws the sun that is created based on the input given by the instance variables.

     * @param   g- the graphic variable
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D sun = new Ellipse2D.Double(xTopLeft, yTopLeft, screenWidth, screenHeight);
        
        g2.setColor(Color.YELLOW);
        
        g2.fill(sun);
    }

}
