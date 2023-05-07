package Stack;
public class StackLL {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Node head=null;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int x){
            Node newnode = new Node(x);

            if(isEmpty()){
                head=newnode;
            }

            else{
                newnode.next=head;
                head=newnode;
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            else{
                int data = head.data;
                head=head.next;
                return data;
            }
        }

        public void display(){
            if (isEmpty()){
                System.out.println("Stack Empty");
            }

            else{
                Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    public static void main(String[] args) {
        StackLL sl = new StackLL();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        System.out.println("Before Poping");
        sl.display();
        sl.pop();
        sl.pop();
        System.out.println("After Poping");
        sl.display();
    }
    
}