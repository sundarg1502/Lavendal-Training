package Assignment14;

import java.util.*;

public class LinkedQueue {
    private List<Integer> list;

    public LinkedQueue() {
        this.list = new LinkedList<>();
    }

    public void enque(int data){
        list.add(data);
    }

    public int deque(){
        int dequed = list.remove(0);
        return dequed;
    }

    public void display(){
        System.out.println(list);
    }
}
