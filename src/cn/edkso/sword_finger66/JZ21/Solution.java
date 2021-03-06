package cn.edkso.sword_finger66.JZ21;

import java.util.Stack;

/**
 * 《栈的压入弹出序列》
 *
 * 题目描述:
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 * 示例1:
 * 输入
 * [1,2,3,4,5],[4,3,5,1,2]
 *
 * 返回值
 * false
 */
public class Solution {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();

        // [1,2,3,4,5],[4,5,3,2,1]
        int k = 0;
        for (int i = 0; i < pushA.length; i++) {
            if (pushA[i] != popA[k]){   //k= 0,3
                stack.push(pushA[i]); // 1 2
            }else{
                while (!stack.isEmpty()){
                    k++; //k = 1,2,3
                    if (stack.peek() == popA[k]){
                        stack.pop();
                    }else{
                        break;
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
