package JavaLinkedlist.DLL;

import java.util.Scanner;

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
    public static void main(String args[])
    {
        DeleteDLL s = new DeleteDLL();
        s.insertatEnd(1);
        s.insertatEnd(2);
        s.insertatEnd(3);
        s.insertatEnd(4);

        System.out.println("linked list:");
        s.traverse();

        System.out.println("\nPress 1 for deletion at beginning");
        System.out.println("Press 2 for deletion at end");
        System.out.println("Press 3 for deletion at given position");
        System.out.println("Enter your choice");

        Scanner input=new Scanner(System.in);
        int ch=input.nextInt();

        switch(ch)
        {
            case 1:
            {
                s.deleteatBeg();
                s.traverse();
                break;
            }
            case 2:
            {
                s.deleteatEnd();
                s.traverse();
                break;
            }

            case 3:
            {
                System.out.println("Enter the position of element");
                int pos = input.nextInt();
                s.deleteatPos(pos);
                s.traverse();
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }
        }
    }
}
