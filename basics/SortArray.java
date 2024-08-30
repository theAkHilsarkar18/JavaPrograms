
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter size : ");
        n = sc.nextInt();

        array = new int[n];

        for(int i=0; i<n; i++)
        {
            for (int j = i+1; j < n; j++) {
                if (array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (Object elem : array) {
            
        }
    }
}
