package JavaLinkedlist.DLL;


public class TraverseDLL {
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

    public void traverse(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

    }

    public static void main(String[] args){
        InsertDLL list = new InsertDLL();
        list.insertatEnd(1);
        list.insertatEnd(2);
        list.insertatEnd(3);
        list.traverse();
    }
}
