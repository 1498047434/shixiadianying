package cn.edkso.sword_finger66.classifcation.stackAndQueue;

import java.util.Stack;

public class Offer30 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()){
            minStack.add(x);
        }else{
            if (minStack.peek() >= x){
                minStack.add(x);
            }
        }
    }

    public void pop() {
        Integer p1 = stack.peek();
        Integer p2 = minStack.peek();

        if (p1.equals(p2)){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Offer30 off = new Offer30();
        off.push(512);
        off.push(-1024);
        off.push(-1024);
        off.push(512);
        off.pop();
        off.min();
        off.pop();
        off.min();
        off.pop();
        off.min();
    }
}
