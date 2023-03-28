package JavaLinkedlist.Exercise;

class SLL
{
    class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;

    public void insertatEnd(int x)
    {
        Node newnode=new Node(x);

        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

//
//    public void reverse(){
//        Node temp = head;
//        while(temp!=null){
//            insertatBeg(temp.data);
//            temp=temp.next;
//        }
//    }


    public void reverse(){
//        if list is empty
        if (head == null) {
            return;
        }

        Node prev = head;
        Node current = head.next;
        Node next = null;


        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
//        making head tail
        head.next = null;
//        making tail head
        head = prev;
    }


}

public class ReverseList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertatEnd(1);
        list.insertatEnd(2);
        list.insertatEnd(3);
        System.out.println("Before Reversing");
        list.display();
        System.out.println("\nAfter Reversing");
        list.reverse();
        list.display();

    }
}
