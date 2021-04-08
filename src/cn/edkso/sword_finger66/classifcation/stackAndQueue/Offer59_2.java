package cn.edkso.sword_finger66.classifcation.stackAndQueue;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Offer59_2 {

    Queue<Integer> queue = new ArrayDeque<>();
    Deque<Integer> deque = new ArrayDeque<>();

    public int max_value() {
        if (deque.isEmpty() && !queue.isEmpty()){
            move();
        }
        if (deque.isEmpty() && queue.isEmpty()){
            return -1;
        }
        return deque.peekLast();
    }

    public void move(){
        //把queue的可能最大值转移到deque
        int flag = queue.size();
        for (int i = 0; i < flag; i++) {
            if (deque.isEmpty() || queue.peek() >= deque.peekLast()){
                deque.addLast(queue.peek());
                queue.add(queue.poll());
            }else {
                queue.add(queue.poll());
            }
        }
    }

    public void push_back(int value) {
        if (deque.isEmpty() && !queue.isEmpty()){
            move();
        }
        if (deque.isEmpty() || value >= deque.peekLast()){
            queue.add(value);
            deque.addLast(value);
        }else {
            queue.add(value);
        }
    }

    public int pop_front() {
        if (queue.isEmpty()){
            return -1;
        }
        if (!deque.isEmpty() && (int)queue.peek() == (int)deque.peekFirst()){
            deque.pollFirst();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        Offer59_2 off = new Offer59_2();
        int max;
        int pop;
        
        max = off.max_value();
        pop = off.pop_front();
        max = off.max_value();
        off.push_back(46);
        max = off.max_value();
        off.pop_front();
        max = off.max_value();
        off.pop_front();
        off.push_back(868);
        off.pop_front();
        off.pop_front();
        off.pop_front();
        off.push_back(525);
        off.pop_front();
        max = off.max_value();
        off.pop_front();
        max = off.max_value();
        off.push_back(123);
        off.push_back(646);
        max = off.max_value();
        off.push_back(229);
        max = off.max_value();
        max = off.max_value();
        max = off.max_value();

        off.push_back(871);
        off.pop_front();
        max = off.max_value();
        off.push_back(285);
        max = off.max_value();
        max = off.max_value();
        max = off.max_value();
        off.pop_front();
        off.push_back(45);
        off.push_back(140);
        off.push_back(837);

        off.push_back(545);
        off.pop_front();
        off.pop_front();
        max = off.max_value();
        off.pop_front();
        off.pop_front();
        max = off.max_value();
        off.push_back(561);
        off.push_back(237);
        off.pop_front();
        off.push_back(633);
        off.push_back(98);
        off.push_back(806);
        off.push_back(717);
        off.pop_front();
        max = off.max_value();

        off.push_back(186);
        max = off.max_value();
        max = off.max_value();
        off.pop_front();
        max = off.max_value();
        max = off.max_value();
        max = off.max_value();
        off.push_back(268);
        off.pop_front();
        off.push_back(29);
        off.pop_front();
        max = off.max_value();
        max = off.max_value();
        max = off.max_value();
        off.push_back(866);
        off.pop_front();
        off.push_back(239);

        off.push_back(3);
        off.push_back(850);
        off.pop_front();
        max = off.max_value();
        off.pop_front();
        max = off.max_value();
        max = off.max_value();
        max = off.max_value();
        off.pop_front();
        off.push_back(310);
        off.pop_front();
        off.push_back(674);
        off.push_back(770);
        off.pop_front();
        off.push_back(525);
        off.pop_front();
        off.push_back(425);
        off.pop_front();
        off.pop_front();
        off.push_back(720);
        off.pop_front();
        off.pop_front();
        off.pop_front();
        off.push_back(373);
        off.push_back(411);
        max = off.max_value();
        off.push_back(831);
        off.pop_front();
        off.push_back(765);
        off.push_back(701);
        off.pop_front();
    }
}
