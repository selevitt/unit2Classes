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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int y = getHeight();
        
        Building build1 = new Building();
        Building build2 = new Building();
        Building build3 = new Building();
        Building build4 = new Building();
        
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
