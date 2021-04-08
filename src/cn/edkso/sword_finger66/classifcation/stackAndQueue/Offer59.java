package cn.edkso.sword_finger66.classifcation.stackAndQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59 {

    //时间复杂度0（n*k）  随着k的增大，时间复杂度上升很多
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length - k + 1; i++) {
            res[i] = curMax(nums, i, i + k - 1);
        }

        return res;
    }

    public int curMax(int[] nums, int l, int r){
        int max = nums[l];
        l++;
        while (l <= r){
            max = max > nums[l] ? max : nums[l];
            l++;
        }
        return max;
    }

    //
    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums.length == 0){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        //双端队列
        int i;
        int j;
        for (i = 0-k+1,j = 0; j < nums.length; i++,j++) {

            //
            if (i > 0 && deque.peekFirst() == nums[i-1]){
                deque.removeFirst();
            }

            //保证双端队列递减
            while (!deque.isEmpty() && deque.peekLast() < nums[j]){
                deque.removeLast();
            }

            deque.addLast(nums[j]);
            if (i >= 0){
                res[i] = deque.peekFirst();
            }
        }

        return res;
    }




    public static void main(String[] args) {
//        int[] res = new Offer59().maxSlidingWindow1(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        int[] res = new Offer59().maxSlidingWindow1(new int[]{1, 3,1,2,0,5}, 3);

        for (int re : res) {
            System.out.println("re = " + re);
        }
    }
}
