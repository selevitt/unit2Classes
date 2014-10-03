public class DistanceConverter
{
   static final double FEET_PER_YARD = 3.0;
   static final double INCHES_PER_FOOT = 12.0;
   static final int ATM = 1;
   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * FEET_PER_YARD;
      double inches = feet * INCHES_PER_FOOT;
      
      System.out.println(yards + " yards are equal to " + feet + " feet");
      System.out.println(yards + " yards are equal to " + inches + " inches");
   }
}