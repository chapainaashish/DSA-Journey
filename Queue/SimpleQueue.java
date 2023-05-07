package Queue;

class Queue {
    private int front, rear, maxsize, currentsize;
    private int [] queueArray;

    Queue(int size){
        maxsize = size;
        front = 0;
        rear = 0;
        currentsize = 0;
        this.queueArray = new int[maxsize];
    }

    public boolean isFull(){
        return currentsize == maxsize;
    }

    public boolean isEmpty(){
        return currentsize == 0;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Full Queue");
        }

        else{
            queueArray[rear++] = data;
            currentsize++;
            System.out.println(data + " inserted");
        }
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Empty Queue\nReturning -1");
            return -1;
        }
        else{
            currentsize--;
            return queueArray[front++];
        }
    }

    public void traverse(){
        for (int i = front; i<rear; i++){
            System.out.print(queueArray[i] + " ");

        }
    }

}

public class SimpleQueue{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.traverse();
    }
}
