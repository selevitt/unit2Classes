

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testCloseDoor()
    {
        Door testDoor = new Door("Jeffry",true);
        testDoor = testDoor.closeDoor();
        assertEquals(false);
    }
    
    @Test
    public void testOpenDoor()
    {
        Door testDoor = newDoor("Jeffry", false);
        testDoor = testDoor.openDoor();
    }
}
