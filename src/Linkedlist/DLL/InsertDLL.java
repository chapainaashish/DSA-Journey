package Linkedlist.DLL;


public class InsertDLL {
    class  Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public Node head = null;

    public void insertatBeg(int x){
        Node newnode = new Node(x);

        if (head == null){
            head=newnode;
        }
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void insertatEnd(int x){
        Node newnode = new Node(x);

        if (head == null){
            head = newnode;
        }

        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newnode;
            newnode.prev = temp;
        }

    }

    public void insertatPos(int x, int pos){
        Node newnode = new Node(x);

        if (pos<1){
            System.out.println("Invalid Position");
        }

        else if (pos == 1){

            if (head == null){
                head = newnode;
            }
            else{
               newnode.next = head;
               head.prev = newnode;
               head = newnode;
            }
        }

        else{
            Node temp = head;

            for(int i=1; temp!=null&&i<pos-1; i++){
                temp = temp.next;
            }

            if (temp!=null){
                newnode.next = temp.next;
                temp.next = newnode;
                temp.next.prev = newnode;
                newnode.prev = temp;
            }
            else
                System.out.println("Invalid Pos");
        }

    }

    public void traverse(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

    }

    public static void main(String[] args){
        InsertDLL list = new InsertDLL();
        list.insertatBeg(1);
        list.insertatEnd(3);
        list.insertatEnd(5);
        list.insertatPos(2, 4);
        list.traverse();
    }
}
