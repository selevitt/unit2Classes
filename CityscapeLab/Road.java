import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * Write a description of class Class2 here.
 * 
 * @Seth (your name) 
 * @10/7/14 (a version number or a date)
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xTopLeft;
    private int yTopLeft;
    private int screenWidth;
    private int screenHeight;

    /**
     * Default constructor for objects of class Class2
     */
    public Road(int x, int y, int width, int height)
    {
        screenWidth = width;
        screenHeight = height;
        xTopLeft = x;
        yTopLeft = y;
    }

    /**
     * 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle r1 = new Rectangle( xTopLeft, yTopLeft, screenWidth, screenHeight);
        
        Rectangle l1 = new Rectangle( xTopLeft + (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l2 = new Rectangle( xTopLeft + 3 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l3 = new Rectangle( xTopLeft + 5 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l4 = new Rectangle( xTopLeft + 7 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l5 = new Rectangle( xTopLeft + 9 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l6 = new Rectangle( xTopLeft + 11 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l7 = new Rectangle( xTopLeft + 13 * (screenWidth/19), yTopLeft +  (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l8 = new Rectangle( xTopLeft + 15 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        Rectangle l9 = new Rectangle( xTopLeft + 17 * (screenWidth/19), yTopLeft + (screenHeight/2), (screenWidth/19), (screenHeight/10));
        
        g2.setColor(Color.BLACK);
        
        g2.draw(r1);
        g2.fill(r1);
        
        g2.setColor(Color.YELLOW);
        
        g2.draw(l1);
        g2.fill(l1);
        g2.draw(l2);
        g2.fill(l2);
        g2.draw(l3);
        g2.fill(l3);
        g2.draw(l3);
        g2.fill(l3);
        g2.draw(l4);
        g2.fill(l4);
        g2.draw(l5);
        g2.fill(l5);
        g2.draw(l6);
        g2.fill(l6);
        g2.draw(l7);
        g2.fill(l7);
        g2.draw(l8);
        g2.fill(l8);
        g2.draw(l9);
        g2.fill(l9);
    }

}
