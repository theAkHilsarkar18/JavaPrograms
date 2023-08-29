import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        // variable declaration
        byte num1; // byte because length of num is -127 to 128
        byte num2;
        byte num3;
        byte num4;

        // Scanner class object for user input
        Scanner input = new Scanner(System.in);

        // to user input in java in num1,num2,num3,num4
        System.out.print("Enter the value of num 1 : ");
        num1 = input.nextByte();
        System.out.print("Enter the value of num 2 : ");
        num2 = input.nextByte();
        System.out.print("Enter the value of num 3 : ");
        num3 = input.nextByte();
        System.out.print("Enter the value of num 4 : ");
        num4 = input.nextByte();

        // find maximum out of 4 variable using nested if else


        if ( num1 > num2 ) {
            if ( num1 > num3 ) {
                if ( num1 > num4 ) {
                    System.out.println("num1 is maximum");
                } else {
                    System.out.println("num4 is maximum");
                }
            } else {
                if ( num3 > num4 ) {
                    System.out.println("num3 is maximum");
                } else {
                    System.out.println("num4 is maximum");
                }
            }
        } else {
            if ( num2 > num3 ) {
                if ( num2 > num4 ) {
                    System.out.println("num2 is maximum");
                } else {
                    System.out.println("num4 is maximum");
                }
            } else {
                if ( num3 > num4 ) {
                    System.out.println("num3 is maximum");
                } else {
                    System.out.println("num4 is maximum");
                }
            }
        }


    }


}
