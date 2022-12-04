package Linkedlist.SLL;
import  java.util.Scanner;

class SearchSLL
{
    class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data =data;
            this.next=null;
        }
    }
    public Node head=null;
    public boolean search(int key)
    {
        Node temp=head;
        while (temp!=null)
        {
            if(temp.data==key)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void display ()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print (temp.data+"-->");
            temp=temp.next;
        }
    }
    public void insertatEnd(int data)
    {
        Node newnode=new Node(data);

        if (head==null){
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

    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        SearchSLL s= new SearchSLL();
        s.insertatEnd(1);
        s.insertatEnd(2);
        s.insertatEnd(3);

        System.out.println("Singly linked list:");
        s.display();

        System.out.println("\nEnter key to search");
        int key = input.nextInt();

        if (s.search(key))
            System.out.println("The key exists");
        else
            System.out.println("The key doesn’t exists in list");
    }
}
