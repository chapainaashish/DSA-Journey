package Queue;

class CQueue{
    int rear, front, size;
    int queueArray[];

    CQueue(int size){
        this.queueArray = new  int[size];
        this.rear = -1;
        this.front = -1;
        this.size = size;
    }

    public  boolean isFull(){
        if (front == 0 && rear == size-1)
            return  true;
        else if (front ==rear +1)
            return true;
        else
            return false;
    }

    public  boolean isEmpty(){
        return  front == -1;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }

        else{
            if (front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            queueArray[rear] = data;
        }

    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Empty\nReturning -1");
            return  -1;
        }
        int data = queueArray[front];
        if (front == rear){
            front = -1;
            rear = -1;
        }
        else {
            front = front+1/size;
        }
        return  data;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CQueue c1 = new CQueue(5);
        c1.enqueue(5);
        c1.enqueue(4);
        c1.enqueue(3);
        c1.enqueue(2);
        c1.enqueue(1);
        c1.enqueue(0);
        c1.dequeue();

    }
}
