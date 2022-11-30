package Linkedlist.SLL;

import java.util.Scanner;

class InsertSLL
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

    public void insertatBeg(int x)
    {
        Node newnode=new Node(x);

        if(head==null)
            head=newnode;

        else
        {
            newnode.next =head;
            head=newnode;
        }
    }

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

    public void insertatPos(int pos,int x)
    {
        Node newnode=new Node (x);

        if(pos< 1)
        {
            System.out.println("Invalid Position");
        }

        else if(pos==1)
        {
            if(head==null)
            {
                head=newnode;
            }
            else
            {
                newnode.next=head;
                head=newnode;
            }
        }

        else
        {
            Node temp = head;
            for(int i= 1;i<pos-1 && temp!=null; i++)
            {
                temp=temp.next;
            }


            if(temp!=null)
            {
                newnode.next=temp.next;
                temp.next =newnode;
            }
            else
            {
                System.out.println("Invalid Position");
            }
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

    public static void main(String args[])
    {
        InsertSLL s = new InsertSLL();
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
                s.display();
                break;
            }
            case 2:
            {
                s.insertatEnd(num);
                s.display();
                break;
            }

            case 3:
            {
                System.out.println("Enter a position ");
                int pos = input.nextInt();
                s.insertatPos(pos,num);
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