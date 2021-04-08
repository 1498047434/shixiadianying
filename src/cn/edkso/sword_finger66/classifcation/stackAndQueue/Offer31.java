package cn.edkso.sword_finger66.classifcation.stackAndQueue;

import java.util.Stack;

/**
 * 示例 1：
 *
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 解释：我们可以按以下顺序执行：
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * 示例 2：
 *
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 */
public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {

            if (!stack.isEmpty() && (int)stack.peek() == popped[j]){
                stack.pop();
                j++;
                i--;
            }else if (pushed[i] == popped[j]){
                j++;
            } else{
                stack.push(pushed[i]);
            }
        }

        while (!stack.isEmpty()){
            if ((int)stack.pop() != popped[j]){
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
//        new Offer31().validateStackSequences(new int[]{1,2,3,4,5},
//                new int[]{4,5,3,2,1});
//        new Offer31().validateStackSequences(new int[]{2,1,0},
//                new int[]{1,2,0});
        new Offer31().validateStackSequences(new int[]{1,2,3,0},
                new int[]{2,1,3,0});

    }
}
