package cn.edkso.sword_finger66.classifcation.dynamic_programming;

public class Offer42 {

    public int maxSubArray(int[] nums) {

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0){
                nums[i] = nums[i-1] + nums[i];
            }
            max = Math.max(max,nums[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int res = new Offer42().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }
}
