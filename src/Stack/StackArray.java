package Stack;



public class StackArray {
    private int size=10, top;
    private int item[] = new int[size];

    StackArray(){
        top=-1;
    }

    public boolean isFull(){
        if (top==size-1) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }

    public void push(int x){
        if(isFull())
            System.out.println("Overflow");
        else{
            top++;
            item[top] = x;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        }
        else{
            int data = item[top];
            top--;
            return data;
        }
    }

    public void display(){
        if (isEmpty())
            System.out.println("Stack Empty");

        else{
            for(int i=top; i>=0; i--){
                System.out.println(item[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray s1 = new StackArray();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("Before Poping");
        s1.display();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println("After Poping");
        s1.display();

    }

}
