package JavaLinkedlist.SLL;

import java.util.Scanner;

public class DeleteSLL
{
    public static class Node
    {
        int data;
        Node next;

        Node(int x)
        {
            this.data=x;
            this.next=null;
        }
    }
    public Node head=null;

    public void deleteatBeg()
    {
        if (head==null)
        {
            System.out.println("Empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            head=head.next;
        }
    }

    public void deleteatEnd()
    {
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else if (head.next==null)
        {
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void deleteatPos(int pos)
    {
        if(pos<1)
        {
            System.out.println("Position invalid");
        }

        else if (pos==1)
        {
            if(head==null)
            {
                System.out.println("Empty list");
            }
            else if(head.next==null)
            {
                head=null;
            }
            else
            {
                head=head.next;
            }
        }
        else
        {
            Node temp=head;
            for(int i=1; i<pos-1&& temp.next!=null;i++)
            {
                temp=temp.next;
            }
            if(temp.next!=null)
            {
                temp.next=temp.next.next;
            }
            else
            {
                System.out.println("Invalid position");
            }

        }
    }

    public void insertatEnd (int data)
    {
        Node newnode=new Node(data);

        if (head == null){
            head=newnode;
        }
        else {
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
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
    }


    public static void main(String args[])
    {
        DeleteSLL s = new DeleteSLL();
        s.insertatEnd(1);
        s.insertatEnd(2);
        s.insertatEnd(3);
        s.insertatEnd(4);

        System.out.println("linked list:");
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
                s.deleteatEnd();
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