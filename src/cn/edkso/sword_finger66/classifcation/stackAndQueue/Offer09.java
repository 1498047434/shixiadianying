package cn.edkso.sword_finger66.classifcation.stackAndQueue;

import java.util.Stack;

public class Offer09 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.empty()){
            if (stack1.empty()){
                return -1;
            }else {
                while (!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }

            }
        }
        return stack2.pop();
    }
}
