
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for loop
        // int i,n;
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter n : ");
        // n = sc.nextInt();

        // for(i=1; i<=n; i++)
        // {
        //     System.out.println(i);
        // }

        // Write a Java program to convert seconds to hours, minutes and seconds
        int seconds,minutes=0,hours=0;
        System.out.print("Enter second : ");
        seconds = sc.nextInt();

        if (seconds>59) { 
            minutes = seconds/60;
            seconds = seconds - (minutes*60);
            if (minutes>59) {
                hours = minutes/60;
                minutes = minutes - (hours*60);
            }
        }

        System.out.println(hours + ":" +minutes+":"+seconds);

    }
}
