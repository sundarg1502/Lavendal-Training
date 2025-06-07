package Assignment14;

import java.util.*;

public class Main {
    
    public static void reverse1StK(Queue<Integer> que, int k){
        Queue<Integer> tempq = new LinkedList();
        Stack<Integer> tempst = new Stack<>();

        for(int i=0;i<k;i++){
            tempst.push(que.poll());
        }
        while(!que.isEmpty()){
            tempq.offer(que.poll());
        }

        while(!tempst.isEmpty()){
            que.offer(tempst.pop());
        }

        while(!tempq.isEmpty()){
            que.offer(tempq.poll());
        }
    }

    public static void main(String[] args) {
        // MyArrayQueue queue = new MyArrayQueue(3);

        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.enqueue(40);
        // queue.deque();
        // queue.display();

        // LinkedQueue lq = new LinkedQueue();

        // lq.enque(10);
        // lq.enque(20);
        // lq.enque(30);
        // lq.enque(40);
        // lq.deque();
        // lq.display();
        
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.add(100);

        System.out.println(q);

        reverse1StK(q, 3);
        System.out.println(q);
    }
}
