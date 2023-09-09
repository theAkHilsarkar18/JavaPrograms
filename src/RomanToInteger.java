import java.util.Map;
import java.util.Scanner;
import java.lang.String;

public class RomanToInteger {

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String roman;
        System.out.println("Enter Number in Roman : ");
        roman = input.next();
        int length = roman.length();
        int response = 0;

        for(int i=0; i<length; i++)
        {
            if(roman.charAt(i)=='I')
            {
                response = response + 1;
            }
            else if(roman.charAt(i)=='V' && length>1)
            {
                response = response + 3;
            }
            else if(length==1 && roman.equals("V") )
            {
                response = 5;
            }
            else if(roman.charAt(0)=='V')
            {
                response = response + 5;
            }
        }
        System.out.println(response);


    }
}
