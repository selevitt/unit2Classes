import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


/**
 * This class creates a road that extends the width of the screen. Also it stays 1/4 of the screen height.
 * 
 * @Seth (your name) 
 * @10/7/14 (a version number or a date)
 */
public class Road
{
    /** This variable is used to determine the x value of the top left corner of the Road*/
    private int xTopLeft;
    /** This variable is used to determine the y value of the top left corner of the Road*/
    private int yTopLeft;
    /** This variable determines the width of the Road */
    private int screenWidth;
    /**  This variable determines the height of the Road*/
    private int screenHeight;

    /**
     * This is the constructor for the Road class and takes the input of integers. They determine the width, height, Top Left X Coordinate, and Top Left Y Coordinate
     * @param - x, y, width, height
     */
    public Road(int x, int y, int width, int height)
    {
        screenWidth = width;
        screenHeight = height;
        xTopLeft = x;
        yTopLeft = y;
    }

    /**
     * This method draws the Road class by establishing the values of the road and other components of it.
     * @param - g2
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
