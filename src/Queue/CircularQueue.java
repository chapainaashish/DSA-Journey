package Queue;

class CQueue{
    int rear, front, currentsize, maxsize;
    int queueArray[];

    CQueue(int maxsize){
        this.queueArray = new  int[maxsize];
        this.rear = -1;
        this.front = 0;
        this.currentsize = 0;
        this.maxsize = maxsize;
    }

    public  boolean isFull(){
        return currentsize==maxsize;
    }

    public  boolean isEmpty(){
        return  currentsize==0;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }

        else{
            rear = (rear+1)%maxsize;
            queueArray[rear] = data;
            currentsize++;
        }

    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue Empty\nReturning -1");
            return  -1;
        }
        front = (front+1)%maxsize;
        int data = queueArray[front];
        currentsize--;
        return  data;
    }

    public void traverse(){
        int i = front;
        while(i!=rear+1){
            System.out.print(queueArray[i] + " ");
             i = (i+1)%maxsize;
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CQueue c1 = new CQueue(5);
        c1.enqueue(5);
        c1.enqueue(4);
        c1.enqueue(5);
        c1.traverse();
        c1.dequeue();
        System.out.println("\nAfter Dequeue");
        c1.traverse();

    }
}
