import java.util.Scanner;

public class StringParsing
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String userInput;
        
        System.out.println("Please enter an integer between 1,000 andd 999,999: ");
        userInput = s.next();
        
        userInput = userInput + " ";
        int length = userInput.length();
        
        String sub = userInput.substring(0, (length - 5));
        String sub2 = userInput.substring((length - 4), length);
        
        System.out.println(sub + sub2);
    }
}