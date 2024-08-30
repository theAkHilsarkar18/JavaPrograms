
public class ConsecutiveArray {

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = new int[]{1,0,1,1,0,1};
        int ans = s1.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    n++;
                } else {
                    break;
                }
            }
        }
        return n;
    }
}
