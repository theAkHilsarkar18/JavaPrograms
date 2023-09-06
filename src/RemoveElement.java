public class RemoveElement {
    public static void main(String[] args) {
        int val = 2;
        int[] nums = {0,1,2,2,3,0,4,2};
        int counut = 0;

        int length = nums.length;
        for(int i=0; i<length; i++)
        {
            if(nums[i]==val)
            {
                counut++;
            }
        }
        int ans = length - counut;
        System.out.println(ans);
    }

}
