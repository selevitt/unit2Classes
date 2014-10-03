

/**
 * The door will open and close and keep track of the state it is in.(open or closed)
 * 
 * @Seth and David
 * @9/17/14
 */
public class Door
{
    /** The state of the door in open or closed. */
    private boolean doorState;
    
    private String doorName;

    /**
     * Default constructor for objects of class Door
     */
    public Door(String door,boolean state)
    {
        this.doorName = door;
        this.doorState = state;
    }

    /**
     * Opens the door
     *
     * @pre     Door has to be closed.
     * @post    Door will be open
     */
    public void openDoor()
    {
        doorState = true;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void closeDoor()
    {
        doorState = false;
    }


    /**
     * 
     */
    public String getName()
    {
       return this.doorName;
    }

    /**
     * 
     */
    public void setName(String newName)
    {
        this.doorName = newName;
    }
}
