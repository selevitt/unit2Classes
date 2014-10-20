import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int year;
        
        System.out.print("Enter a Year: ");
        year = s.nextInt();
        
        if((year%400) == 0)
        {
           System.out.println("This year is a leap year."); 
        }
        else if((year%100)== 0)
        {
            System.out.println("This year is a not leap year."); 
        }
        else if((year%4)== 0)
        {
            System.out.println("This year is a  leap year."); 
        }
        else
        {
            System.out.println("This year is a not leap year."); 
        }
    }
}
