import java.util.Arrays;

public class ArrayFindSum {
    public static void main(String[] args) {

        short[] array; // declaration of array in java
        short[] list = new short[5]; // instantiate , give fixed size to the array
        short[] collection = {2, 3, 8, 2 , 4, 5}; // declaration + instantiate + initialize of the array in java
        short[] targetList = new short[2];

        // target value
        short target = 9; // find a pair of the values which sum is 9.

        // to find length of array
        int n = collection.length;

        outerLoop :
        for (short i = 0; true; i++) {
            for (short j = 0; j<n; j++) {
                if ( i != j && collection[i] + collection[j] == target) {
                    targetList[0] = collection[i];
                    targetList[1] = collection[j];
                    System.out.println(collection[i]);
                    System.out.println(collection[j]);
                    break outerLoop;
                }
            }
        }

        System.out.println(Arrays.toString(targetList));


    }
}
