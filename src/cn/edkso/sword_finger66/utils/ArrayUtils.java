package cn.edkso.sword_finger66.utils;

public class ArrayUtils {

    public static void swapInt(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
