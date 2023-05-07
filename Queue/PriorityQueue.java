package Queue;

public class PriorityQueue {
    int rear, currentsize, maxsize;
    int queue[];

    PriorityQueue(int size){
        maxsize=size;
        rear = -1;
        currentsize=0;
        queue = new int[size];
    }

    int findMinIndex(){
        int min = 0;
        for (int i=0; i<=rear; i++){
            if (queue[i]<queue[min])
            {
                min = i;
            }
        }
        return  min;
    }

    boolean isEmpty(){
        return currentsize==0;
    }

    boolean isFull(){
        return currentsize==maxsize;
    }

    void enqueue(int data){
        if (isFull()){
            System.out.println("Queue already full");
        }
        else{
            rear++;
            currentsize++;
            queue[rear] = data;
        }
    }

    int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty\nReturning -1");
            return  -1;
        }
        else {
            int min = findMinIndex();
            int data = queue[min];
            rear--;
            currentsize--;
            for(int i = min; i<=rear; i++){
                queue[i] = queue[i+1];
            }
            return data;
        }
    }

    void traverse(){
        for(int i = 0; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        pq.enqueue(1);
        pq.enqueue(2);
        pq.traverse();
        pq.dequeue();
        System.out.println("After Dequeue");
        pq.traverse();

    }
}
