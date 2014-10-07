import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;



/**
 * Write a description of class Class1 here.
 * 
 * @Seth (your name) 
 * @10/3/14 (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xTopLeft;
    private int yTopLeft;
    private int screenWidth;
    private int screenHeight;
    
    static final double WINDOW_RATIO_WIDTH = 1.0/5;
    static final double WINDOW_RATIO_HEIGHT = 1.0/13;
    /**
     * Default constructor for objects of class Class1
     */
    public Building(int x, int y, int width, int height)
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
        Rectangle r1 = new Rectangle( xTopLeft, yTopLeft, screenWidth, screenHeight);
        
        int winWidth = (int)(screenWidth * WINDOW_RATIO_WIDTH);
        int winHeight = (int)(screenHeight * WINDOW_RATIO_HEIGHT);
        
        Rectangle w1 = new Rectangle( xTopLeft + winWidth, yTopLeft + winHeight, winWidth, winHeight);
        Rectangle w2 = new Rectangle( xTopLeft + (3 * winWidth), yTopLeft + winHeight, winWidth, winHeight);
        Rectangle w3 = new Rectangle( xTopLeft + winWidth, yTopLeft + (3 * winHeight), winWidth, winHeight);
        Rectangle w4 = new Rectangle( xTopLeft + (3 * winWidth), yTopLeft + (3 * winHeight), winWidth, winHeight);
        Rectangle w5 = new Rectangle( xTopLeft + winWidth, yTopLeft + (5 * winHeight), winWidth, winHeight);
        Rectangle w6 = new Rectangle( xTopLeft + (3 * winWidth), yTopLeft + (5 * winHeight), winWidth, winHeight);
        Rectangle w7 = new Rectangle( xTopLeft + winWidth, yTopLeft + (7 * winHeight), winWidth, winHeight);
        Rectangle w8 = new Rectangle( xTopLeft + (3 * winWidth), yTopLeft + (7 * winHeight), winWidth, winHeight);
        Rectangle w9 = new Rectangle( xTopLeft + winWidth, yTopLeft + (9 * winHeight), winWidth, winHeight);
        Rectangle w10 = new Rectangle( xTopLeft + (3 * winWidth), yTopLeft + (9 * winHeight), winWidth, winHeight);
        
        Rectangle d1 = new Rectangle(xTopLeft + winWidth, yTopLeft + (11 * winHeight), (winWidth * 3), (winHeight * 2));
        g2.setColor(Color.BLACK);
        
        g2.draw(r1);
        
        g2.draw(w1);
        g2.draw(w2);
        g2.draw(w3);
        g2.draw(w4);
        g2.draw(w5);
        g2.draw(w6);
        g2.draw(w7);
        g2.draw(w8);
        g2.draw(w9);
        g2.draw(w10);
        
        g2.draw(d1);
    }

}
