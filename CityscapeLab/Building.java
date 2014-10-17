import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * This class creates a building with two columns and four rows of windows that are proportionally to the building no matter what size the building is. It draws th building based on the input of
 * the x and y coordinates as well as the width and height.
 * 
 * @Seth (your name) 
 * @10/3/14 (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xTopLeft;
    /** description of instance variable x (add comment for each instance variable) */
    private int yTopLeft;
    /** description of instance variable x (add comment for each instance variable) */
    private int screenWidth;
    /** description of instance variable x (add comment for each instance variable) */
    private int screenHeight;
    
    static final double WINDOW_RATIO_WIDTH = 1.0/5;
    static final double WINDOW_RATIO_HEIGHT = 1.0/13;
    /**
     * Default constructor for objects of class Building
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
        
        Point2D p1 = new Point2D.Double(xTopLeft + winWidth + (winWidth * 3.0 / 2) , yTopLeft + (11 * winHeight));
        Point2D p2 = new Point2D.Double(xTopLeft + winWidth + (winWidth * 3.0 / 2) , yTopLeft + (11 * winHeight) + winHeight * 2);
        Line2D l1 = new Line2D.Double(p1 , p2);
        
        double p3 = (xTopLeft + winWidth + (winWidth * 3.0 / 2) - (winWidth * 3.0 / 10));
        double p4 = (yTopLeft + (11 * winHeight) + winHeight);
        double p5 = (winWidth * 3.0 / 15);
        
        Ellipse2D knob1 = new Ellipse2D.Double( p3, p4, p5, p5);
        
        double p6 = (xTopLeft + winWidth + (winWidth * 3.0 / 2) + (winWidth * 3.0 / 30));
        
        Ellipse2D knob2 = new Ellipse2D.Double( p6, p4, p5, p5);
        
        g2.setColor(Color.BLACK);
        
        g2.draw(r1);
        
        g2.setColor(Color.GRAY);
        g2.fill(r1);
        
        g2.setColor(Color.BLACK);
        
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
        
        g2.draw(l1);
        
        g2.draw(knob1);
        g2.draw(knob2);
        
        g2.fill(knob1);
        g2.fill(knob2);
        
        g2.setColor(Color.YELLOW);
        
        g2.fill(w1);
        g2.fill(w2);
        g2.fill(w3);
        g2.fill(w4);
        g2.fill(w5);
        g2.fill(w6);
        g2.fill(w7);
        g2.fill(w8);
        g2.fill(w9);
        g2.fill(w10);
        
    }

}
