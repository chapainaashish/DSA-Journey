package JavaLinkedlist.CSLL;

public class InsertCSLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public Node head=null;

    public void  inseratBeg(int x){
        Node newnode = new Node(x);
        if(head==null){
            newnode.next=head;
            head=newnode;
        }
        if (head.next==head){
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

    public void insertatPos(int x,int pos){
        Node newnode = new Node(x);

        if(pos<1){
            System.out.println("Invalid position");
        }
        else if(pos==1){
            if(head.next==head){
                newnode.next=head;
                head.next=newnode;
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
        else {
            Node temp = head;
            for (int i = 1; i < pos-1&&temp!=head; i++) {
                temp=temp.next;
            }
            if (temp!=head){
                newnode.next=temp.next;
                temp.next=newnode;
            }
            else {
                System.out.println("Invalid position");
            }
        }
    }

}
