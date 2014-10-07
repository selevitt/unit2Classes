import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
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
    static final double BUILDING_WIDTH = 1/9;
    static final double BUILDING_HEIGHT = 5/8;
    static final double TOP_LEFT_HEIGHT = 1/8;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        double width = getWidth();
        double height = getHeight();
        
        double bWidth = width * BUILDING_WIDTH;
        double bLeft = height * TOP_LEFT_HEIGHT;
        double bHeight = height * BUILDING_HEIGHT;
        
        Building build1 = new Building(bWidth , bLeft, bWidth, bHeight);
        Building build2 = new Building(3 * bWidth , bLeft, bWidth, bHeight);
        Building build3 = new Building(5 * bWidth , bLeft, bWidth, bHeight);
        Building build4 = new Building(7 * bWidth , bLeft, bWidth, bHeight);
        
        Road road1 = new Road();
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        
        build1.draw(g2);
        build2.draw(g2);
        build3.draw(g2);
        build4.draw(g2);
        
        road1.draw(g2);
        
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
        car5.draw(g2);
        
    }

}
