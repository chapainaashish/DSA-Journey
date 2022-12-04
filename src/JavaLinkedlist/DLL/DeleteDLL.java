package Linkedlist.DLL;

public class DeleteDLL {
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

    public void deleteatBeg(){

        if (head == null){
            System.out.println("Empty list");
        }
        else {
            head.next.prev = null;
            head = head.next;
        }
    }

    public void deleteatEnd(){
        if (head == null){
            System.out.println("Empty list");
        }
        else {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.prev.next = null;
            temp = null;
        }
    }

    public void deleteatPos(int pos){
        if (head == null){
            System.out.println("Empty list");
        }
        if (pos<1){
            System.out.println("Invalid Position");
        }

        else{
            Node temp = head;
            for(int i=1; i<pos-1&&temp!=null; i++){
                temp = temp.next;
            }

            if(temp!=null){
                temp.next.prev = temp;
                temp.next = temp.next.next;
            }
            else
                System.out.println("Invalid Position");
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

    public void traverse(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        DeleteDLL list = new DeleteDLL();
        list.insertatEnd(1);
        list.insertatEnd(2);
        list.insertatEnd(3);
        list.insertatEnd(4);
        list.insertatEnd(5);

        list.deleteatBeg();
        list.deleteatEnd();
        list.deleteatPos(2);
        list.traverse();

    }

}
