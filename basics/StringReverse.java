
import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String name;
         char[] nameArray;

         System.out.print("Enter a name : ");
         name = sc.nextLine();

         name = name.trim();
         nameArray = name.toCharArray();

         for(char i : nameArray)
         {
            System.out.print(i);
         }
        
         System.out.println();
        
         for (int i=nameArray.length-1; i>=0; i--) {
             System.out.print(nameArray[i]);
         }

    }
}
