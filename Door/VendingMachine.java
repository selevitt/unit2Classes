

/**
 * The Vending Machine Class allows a user to insert tokens, add cans, drop cans, 
 * check tokens, and check number of cans.
 * 
 * @Seth
 * @9/19/14 
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans, int tokens)
    {
       this.cans = cans;
       this.tokens = tokens;
    }

    /**
     * 
     */
    public void insertToken()
    {
        this.tokens = tokens + 1;
        this.cans = cans - 1;
    }

    /**
     * 
     */
    public void fillUp(int addcans)
    {
        this.cans = cans + addcans;
    }
    

    /**
     *
     */
    public int getToken()
    {
        return this.tokens;
    }
    

    /**
     * 
     */
    public int getCan()
    {
        return this.cans;
    }



}
