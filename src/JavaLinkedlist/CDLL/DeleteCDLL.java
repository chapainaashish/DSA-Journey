package JavaLinkedlist.CDLL;



import java.util.Scanner;

public class DeleteCDLL {
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



    public void deleteatBeg() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            head.prev = temp;
        }
    }

    public void deleteatLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
            head.prev = temp;

        }
    }

    public void deleteatPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
        } else if (pos < 1) {
            System.out.println("Invalid position");
        } else if (pos == 1) {
            deleteatBeg();
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
    }
    public static void main(String args[])
    {
        DeleteCDLL s = new DeleteCDLL();
        s.insertatBeg(54);
        s.insertatBeg(45);
        s.insertatBeg(78);

        System.out.println("CDLL:");
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
