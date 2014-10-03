import java.util.Scanner;

public class Rectangle
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double w, l;
        
        System.out.println("Enter the width of the rectangle.");
        w = s.nextDouble();
        System.out.println("Enter the length of the rectangle.");
        l = s.nextDouble();
        
        double area = w*l;
        double perimeter = (2*w)+(2*l);
        double diagonal = Math.sqrt( Math.pow(w , 2) + Math.pow(l, 2));
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
    }
}
        
        