import java.util.Scanner;

public class Pseudocode
{
    static final double METERS_TO_FEET = 3.28084;
    static final double FEET_TO_MILES = 0.000189394;
    static final double FEET_TO_INCHES = 12.0;
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      
      double meters;
      
      System.out.println("Please enter a number of meters: ");
      meters = s.nextDouble();
        
      double feet = meters * METERS_TO_FEET;
      double inches = feet * FEET_TO_INCHES;
      double miles = feet * FEET_TO_MILES;
      
      System.out.println(meters + " meters are equal to " + feet + " feet");
      System.out.println(meters + " meters are equal to " + inches + " inches");
      System.out.println(meters + " meters are equal to " + miles + " miles");
    }
}