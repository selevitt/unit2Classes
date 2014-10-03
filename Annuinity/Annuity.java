import java.util.Scanner;

public class Annuity
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double i,n,pMT;
        System.out.println("Enter the Periodic Interest or Compound Rate");
        i = s.nextDouble();
        System.out.println("Enter the number of Payments");
        n = s.nextDouble();
        System.out.println("Enter the Payout");
        pMT = s.nextDouble();
        
        double nom = (Math.pow(1+i, n-1))-1;
        double denom = (Math.pow(1+i, n-1));
        double pVann = pMT*(((nom/i)/denom)+1);
        
        System.out.println(pVann);
    }
}