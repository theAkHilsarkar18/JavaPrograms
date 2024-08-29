
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // check largest number from 3 numbers
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("a is maximum");
            }
            else{
                System.out.println("c is maximum");
            }
        }else{
            if (b>c) {
                System.out.println("b is maximum");
            }else{
                System.out.println("c is maximum");
            }
        }
    }
}
