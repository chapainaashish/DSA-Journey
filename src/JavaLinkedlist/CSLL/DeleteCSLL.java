package JavaLinkedlist.CSLL;

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
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
            temp.next.next = null;
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
}
