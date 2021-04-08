package cn.edkso.sword_finger66.JZ20;

import java.util.Stack;

/**
 * 《包含min函数的栈》
 *
 * 题目描述:
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution {

    Stack<Integer> normal = new Stack();
    Stack<Integer> minval = new Stack();
    public void push(int node) {
        normal.push(node);
        if (minval.isEmpty()){
            minval.push(node);
        }else{
            if (node <= minval.peek()){
                minval.push(node);
            }else{
                minval.push(minval.peek());
            }
        }
    }

    public void pop() {
        normal.pop();
        minval.pop();
    }

    public int top() {
        return normal.peek();
    }

    public int min() {
        return minval.peek();
    }
}
