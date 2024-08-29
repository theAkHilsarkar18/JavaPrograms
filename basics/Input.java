import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
    
       int a,b,sum;
        
       System.out.print("Enter a : ");
       a = sc.nextInt();
       System.out.print("Enter b : ");
       b = sc.nextInt();

       sum = a + b;

       System.out.println("a + b = " + sum);
    }
}

