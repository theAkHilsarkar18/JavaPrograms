

import java.util.Scanner;

// class is the collection of method and attributes
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // there are total two types of datatype in java
        // 1. Primitive datatype
        // there are total 8 primitive datatype in java
        // And this 8 datatype are divided into manly 3 types of datatype
        // 1. Boolean -> 1. boolean
        // 2. Character -> 1. char
        // 3. Numeric -> 1. Integer , 2. Floating point
        //      Integer - > int,long,byte,short
        //      float   - > float,double
        // 2. Non-primitive datatype
        // string , array , class

        // integral datatype
        byte b;   // 1 byte  -128 to 127
        short s;  // 2 byte  -32,768 to 32,767 = 32000
        int i;    // 4 byte  -2,147,483,648 to 2,147,483,648 = 10 digit but start with 2
        long l;   // 8 byte  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808 = 19 digit
        //floating point datatype
        float f;  // 4 byte     unlimited
        double d; // 8 byte     unlimited
        //character datatype
        // 2 byte     single character
        //Boolean
        boolean b1; // 1 bit    true/false
        b = input.nextByte();
        s = input.nextShort();
        i = input.nextInt();
        l = input.nextLong();
        f = input.nextFloat();
        d = input.nextDouble();
        b1 = input.nextBoolean();
        String name = input.next();
        String line = input.nextLine();

    }

}
