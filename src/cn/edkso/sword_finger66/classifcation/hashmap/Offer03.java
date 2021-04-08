package cn.edkso.sword_finger66.classifcation.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer03 {

    public int findRepeatNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else{
                return nums[i];
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) return nums[i];
        }
        return -1;
    }
//    public int findRepeatNumber1(int[] nums) {
//        int l;
//        int r = nums.length;
//        int mid;
//        for (int i = 0; i < nums.length; i++) {
//            l = i + 1;
//            while (l <= r){
//                mid = l + (r-l) /2;
//                if (nums[mid] == nums[i]){
//                    return nums[i];
//                }else if (nums[mid]){
//
//                }
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {

        new Offer03().findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
    }
}
