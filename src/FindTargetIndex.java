import java.util.Scanner;
public class FindTargetIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        int[] nums = {0, 9, 8, 7, 6, 5, 4, 3, 2,2,1};
        // this loop return first matched position of target value
        int target;
        System.out.print("Enter target value : ");
        target = input.nextInt();
        outerLoop:
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i]==target)
                {
                    System.out.println(i);
                    break outerLoop;
                }
            }
        }
    }
}
