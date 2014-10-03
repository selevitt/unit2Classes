import java.util.Scanner;

public class StringParsing2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String userInput;
        
        System.out.println("Please enter an integer between 1000 andd 999999: ");
        userInput = s.next();
        
        userInput = userInput + " ";
        int length = userInput.length();
        
        String sub = userInput.substring(0, (length - 4));
        String sub2 = userInput.substring((length - 4), length);
        
        System.out.println(sub + "," + sub2);
    }
}