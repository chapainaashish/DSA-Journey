package JavaLinkedlist.CSLL;


import java.util.Scanner;

public class DeleteCSLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void deleteatBeg() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.next == head) {
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void deleteatLast(){
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.next == head) {
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next.next!= head) {
                temp = temp.next;
            }
            temp.next = head;

        }
    }

    public void deleteatPos(int pos){
        if (head == null) {
            System.out.println("List is empty");
        }

        else if (pos<1){
            System.out.println("Invalid position");
        }

        else if (pos==1){
            if (head.next == head) {
                head = null;
            }
            else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void  insertatBeg(int x){
        Node newnode = new Node(x);
        if(head==null){
            head=newnode;
            head.next=head;

        }
        else if (head.next==head){
            head.next=newnode;
            newnode.next=head;
            head=newnode;
        }
        else {
            Node temp = head;
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void display(){
        Node temp = head;
        if (head==null){
            System.out.println("List is empty");
        }
        else {
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            } while (temp!=head);
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        DeleteCSLL s = new DeleteCSLL();
        s.insertatBeg(34);
        s.insertatBeg(99);
        s.insertatBeg(677);

        System.out.println("CSLL:");
        s.display();

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
                s.display();
                break;
            }
            case 2:
            {
                s.deleteatLast();
                s.display();
                break;
            }

            case 3:
            {
                System.out.println("Enter the position of element");
                int pos = input.nextInt();
                s.deleteatPos(pos);
                s.display();
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }
        }
    }
}
