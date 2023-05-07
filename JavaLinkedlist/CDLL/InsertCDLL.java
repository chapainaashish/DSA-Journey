package JavaLinkedlist.CDLL;

import java.util.Scanner;

public class InsertCDLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;

    public void insertatBeg(int x) {
        Node newnode = new Node(x);
        if (head == null) {
            head = newnode;
            head.next = head;
            head.prev = head;
        }
        else if (head.next == head) {
            head.next = newnode;
            newnode.prev = head;
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void insertatpos(int x, int pos) {
        Node newnode = new Node(x);
        if (pos < 1) {
            System.out.println("Invalid position");
        }
        else if (pos == 1) {
            if (head == null) {
                head = newnode;
                newnode.next = head;
                newnode.prev = head;
            }
            else if (head.next == head) {
                head.next = newnode;
                newnode.prev = head;
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
            }
            else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newnode;
                newnode.prev = temp;
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
            }
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp = temp.next;
            }


            if(temp!=head){
                newnode.next = temp.next;
                newnode.prev = temp;
                temp.next.prev = newnode;
                temp.next = newnode;
            }
            else{
                System.out.println("Invalid position");
            }
        }
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        InsertCDLL s = new InsertCDLL();
        Scanner input = new Scanner(System.in);

        // for default
        s.insertatBeg(38);
        s.insertatBeg(90);
        s.insertatBeg(88);

        System.out.println("Enter a number");
        int num = input.nextInt();


        System.out.println("press 1 for insertion at Beginning");
        System.out.println("press 2 for insertion at Specified Position");
        System.out.println("Enter your choice: ");


        int choice=input.nextInt();

        switch(choice)
        {
            case 1:
            {
                s.insertatBeg(num);
                s.display();
                break;
            }


            case 2:
            {
                System.out.println("Enter a position ");
                int pos = input.nextInt();
                s.insertatpos(num,pos);
                s.display();
                break;
            }

            default:
            {
                System.out.println("Invalid Input");
            }
        }
    }
}
