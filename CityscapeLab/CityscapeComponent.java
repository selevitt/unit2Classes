import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Seth Levitt
 * @version 17 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * The method that establishes which objects will draw and where thaey are.
     * @param  - g
     */
    static final double BUILDING_WIDTH = 1.0/9;
    static final double BUILDING_HEIGHT = 5.0/8;
    static final double TOP_LEFT_HEIGHT = 1.0/8;
    static final double ROAD_HEIGHT = 1.0/4;
    static final double SUN_RATIO_WIDTH = 1.0/8;
    static final double SUN_RATIO_HEIGHT = 1.0/25;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int width = getWidth();
        int height = getHeight();
        
        int bWidth = (int)(width * BUILDING_WIDTH);
        int bLeft = (int)(height * TOP_LEFT_HEIGHT);
        int bHeight = (int)(height * BUILDING_HEIGHT);
        
        int rHeight = (int)(height * ROAD_HEIGHT);
        
        Rectangle sky = new Rectangle( 0 , 0, width, height);
        
        Building build1 = new Building(bWidth , bLeft, bWidth, bHeight);
        Building build2 = new Building(3 * bWidth , bLeft, bWidth, bHeight);
        Building build3 = new Building(5 * bWidth , bLeft, bWidth, bHeight);
        Building build4 = new Building(7 * bWidth , bLeft, bWidth, bHeight);
        
        Road road1 = new Road(0,bLeft + bHeight, width - 1, rHeight);
        
        
        int sunWidth = (int)(width * SUN_RATIO_WIDTH);
        int sunHeight = (int)(height * SUN_RATIO_HEIGHT);
        Sun sun1 = new Sun(width - sunWidth, 0 + sunHeight, sunWidth, sunWidth);
        
        g2.setColor(Color.BLUE);
        g2.fill(sky);
        
        sun1.draw(g2);
        
        build1.draw(g2);
        build2.draw(g2);
        build3.draw(g2);
        build4.draw(g2);
        
        road1.draw(g2);
        

    }

}
