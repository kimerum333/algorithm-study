package datastructure.Queue;

public class MyGenericQueue<T> {
    private int front,rear,size,capacity;
    private T[] contents;

    private MyGenericQueue(){

    }

    @SuppressWarnings("unchecked")
    public MyGenericQueue(int capacity){
        this.size = 0;
        this.rear = -1;
        this.front = 0;
        this.capacity = capacity;
        this.contents = (T[])new Object[capacity];
    }

    public boolean enqueue(T element){
        if(size==capacity){
            System.out.println("datastructure.Queue overflow");
            return false;
        }
        rear = (rear+1)%capacity;
        contents[rear]=element;

        size++;
        return true;
    }

    public T dequeue(){
        if (size==0){
            System.out.println("queue underflow");
            return null;
        }
        T element = contents[front];
        contents[front]=null;
        front=(front+1)%capacity;

        size--;
        return element;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public T[] getContents() {
        return contents;
    }

    public static void main(String[] args) {
        MyGenericQueue<Integer> queue = new MyGenericQueue<>(4);

        System.out.println("Enqueue: " + queue.enqueue(1)); // true
        System.out.println("Enqueue: " + queue.enqueue(2)); // true
        System.out.println("Enqueue: " + queue.enqueue(3)); // true
        System.out.println("Enqueue: " + queue.enqueue(4)); // true
        System.out.println("Enqueue: " + queue.enqueue(5)); // false (overflow)

        System.out.println("Dequeue: " + queue.dequeue()); // 1
        System.out.println("Dequeue: " + queue.dequeue()); // 2
        System.out.println("Dequeue: " + queue.dequeue()); // 3

        System.out.println("Enqueue: " + queue.enqueue(6)); // true

        System.out.println("Dequeue: " + queue.dequeue()); // 4
        System.out.println("Dequeue: " + queue.dequeue()); // 6
        System.out.println("Dequeue: " + queue.dequeue()); // null (underflow)


    }
}
