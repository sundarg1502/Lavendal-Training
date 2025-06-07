package Assignment14;

public class MyArrayQueue {
    private int[] arr;
    private final int initial_capacity;
    private int rear;

    public MyArrayQueue(int initial_capacity) {
        this.initial_capacity = initial_capacity;
        this.arr = new int[initial_capacity];
        this.rear = -1;
    }
    public boolean isFull(){
        return rear == initial_capacity-1;
    }

    public boolean isEmpty(){
        return rear == -1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Over Flow");
            return ;
        }
        arr[++rear] = data;
    }

    public int deque(){
        if(isEmpty()){
            System.out.println("Under Flow");
            return -1;
        }
        int dequed = arr[0];

        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        return dequed;
    }

    public void display(){
        for(int i=0;i<rear;i++){
            System.out.print(arr[i]+" ->");
        }
    }
}
