
public class ConsecutiveArray {

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = new int[]{1,0,1,1,1};
        int ans = s1.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0,j=0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                n++;
                ans[j] = n;
            }
            else{
                n=0;
                j++;
            }
        }
        n=0;
        for (int i = 0; i < j; i++) {
            System.out.println(ans[i]);
           if (n<ans[i]) {
                n=ans[i];
           }
        }
        return n;
    }
}


