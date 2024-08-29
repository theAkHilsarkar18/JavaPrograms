
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for loop
        int i=1,n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
