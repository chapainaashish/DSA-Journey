package JavaLinkedlist.DLL;

import java.util.Scanner;

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


            if (temp==null)
                System.out.println("Invalid Pos");

            else if (temp.next==null){
                temp.next = newnode;
                newnode.prev= temp;

            }

            else{
                newnode.next = temp.next;
                temp.next.prev = newnode;
                temp.next = newnode;
                newnode.prev = temp;
            }

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
        InsertDLL s = new InsertDLL();
        Scanner input = new Scanner(System.in);

        // for default
        s.insertatBeg(40);
        s.insertatBeg(90);

        System.out.println("Enter a number");
        int num = input.nextInt();

        System.out.println("press 1 for insertion at beginning");
        System.out.println("press 2 for insertion at End");
        System.out.println("press 3 for insertion at Specified Position");
        System.out.println("Enter your choice: ");


        int choice=input.nextInt();

        switch(choice)
        {
            case 1:
            {
                s.insertatBeg(num);
                s.traverse();
                break;
            }
            case 2:
            {
                s.insertatEnd(num);
                s.traverse();
                break;
            }

            case 3:
            {
                System.out.println("Enter a position ");
                int pos = input.nextInt();
                s.insertatPos(num,pos);
                s.traverse();
                break;
            }

            default:
            {
                System.out.println("Invalid Input");
            }
        }
    }
}
